package com.neebal.collegemgmt.controllers;

import com.neebal.collegemgmt.Student;
import com.neebal.collegemgmt.services.GreetingsService;
import com.neebal.collegemgmt.services.MasterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalTime;

@Controller
@SessionAttributes("username")
public class StudentController {

    @Autowired
    private GreetingsService greetingsService;

    @Autowired
    private MasterDataService masterDataService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(
            ModelMap modelMap,
//            @RequestParam(required = false) String registerSuccess
            @ModelAttribute("registerSuccess") String registerSuccess,
            @ModelAttribute("invalidCreds") String invalidCreds

    ) {
        modelMap.put("greeting", this.greetingsService.getGreetings());
        modelMap.put("registerSuccess", registerSuccess);
        modelMap.put("invalidCreds", invalidCreds);
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
        public String showRegisterPage(ModelMap modelMap) {
        modelMap.put("countries", this.masterDataService.getCountries());
        modelMap.put("greeting", this.greetingsService.getGreetings());
        return "register";
    }

//    Collecting form data using parameter annotations
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//        public String submitRegisteredStud(
//                @RequestParam String username,
//                @RequestParam String password,
//                @RequestParam String country,
//                @RequestParam String gender
//    ) {
//        System.out.println(username + " " + password + " " + country + " " + gender);
//        return null;
//    }

//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//        public String submitRegisteredStud(@ModelAttribute Student student) {
//        System.out.println(student.getUsername() +
//                " " + student.getPassword() +
//                " " + student.getCountry() +
//                " " + student.getGender()
//        );
//
//        // imagine Student data is persisted in database
//        // redirected to the url /login
////        return "login";
//        return "redirect:/login?registerSuccess=1";
//    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
        public String submitRegisteredStud(
                @ModelAttribute Student student,
                RedirectAttributes redirectAttributes

    ) {
        System.out.println(student.getUsername() +
                " " + student.getPassword() +
                " " + student.getCountry() +
                " " + student.getGender()
        );

        redirectAttributes.addFlashAttribute(
                "registerSuccess",
                1
        );

        return "redirect:/login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String authenticate(
        @RequestParam String username,
        @RequestParam String password,
        RedirectAttributes redirectAttributes,
        Model model
    ) {
        Student student = this.masterDataService.authenticate(username, password);
        if(student == null) {
            redirectAttributes.addFlashAttribute(
                    "invalidCreds",
                    "1"
            );

            return "redirect:/login";
        } else {
            model.addAttribute("username", username);

            return "redirect:/home";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus) {
        sessionStatus.setComplete(); // clears the model attributes from the session
        return "redirect:/login";
    }

}
