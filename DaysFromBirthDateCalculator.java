package com.lesson1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DaysFromBirthDateCalculator {

    public static void main(String[] args) {
       System.out.println(daysFromBirthDate("2017-02-23"));
    }

    public static long daysFromBirthDate(String birthDateString) {
        LocalDate curentDate =  LocalDate.now();
        LocalDate birthDate = LocalDate.parse(birthDateString);
        long days = ChronoUnit.DAYS.between(birthDate,curentDate);
        return days;
    }

}
