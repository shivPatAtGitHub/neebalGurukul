package com.neebal.collegemgmt.services;

import com.neebal.collegemgmt.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MasterDataService {
    private List<String> countries;
    private List<Student> students;
    public MasterDataService() {
        this.students = Arrays.asList(
                new Student("admin", "123", "In", "m"),
                new Student("xyz", "456", "USA", "f")
        );


        this.countries = Arrays.asList(
                "USA",
                "China",
                "India",
                "Brazil",
                "Canada"
        );
    }

    public  List<String> getCountries() {
        return this.countries
                .stream()
                .map(country -> country.toUpperCase())
                .collect(Collectors.toList());
    }

    public  Student authenticate(String username, String password) {
        List<Student> students = this.students
                .stream()
                .filter(student -> student.getUsername().equals(username)
                        && student.getPassword().equals(password))
                .collect(Collectors.toList());

        if(students.size() > 0) {
            return students.get(0);
        }
        return null;
    }
}

