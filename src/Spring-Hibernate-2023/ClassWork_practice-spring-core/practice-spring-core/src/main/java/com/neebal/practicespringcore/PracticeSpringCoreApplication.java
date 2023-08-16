package com.neebal.practicespringcore;

import com.neebal.practicespringcore.services.SupriseMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PracticeSpringCoreApplication implements CommandLineRunner {

	@Autowired
	private SupriseMeService supriseMeService;
	@Autowired
	private SupriseMeService supriseMeService2;

	public static void main(String[] args) {

		SpringApplication.run(PracticeSpringCoreApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter username: ");
			String username = scanner.nextLine();
			System.out.println(
					String.format("Welcome %s", username)
			);

			//do not do this
//			System.out.println(new SupriseMeService().getMovie());

//			instead
			System.out.println(this.supriseMeService.getMovie());
			System.out.println(this.supriseMeService2.getMovie());
		}



	}
}
