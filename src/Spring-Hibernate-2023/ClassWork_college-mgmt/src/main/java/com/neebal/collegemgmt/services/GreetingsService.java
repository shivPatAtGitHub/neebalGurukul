package com.neebal.collegemgmt.services;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingsService {
    public String getGreetings() {
        LocalTime localTime = LocalTime.now();
        int hourOfDay = localTime.getHour();
        String message;
        if (hourOfDay > 0 && hourOfDay < 12) {
            message = "Good Morning";
        } else if (hourOfDay >= 12 && hourOfDay < 16) {
            message = "Good Afternoon";
        } else {
            message = "Good Evening";
        }
        return message;
    }
}
