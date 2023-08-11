package com.demoqa.pages.utils;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomFirstName() {
        return new Faker(new Locale("ru")).name().firstName();
    }

    public static String getRandomLastName() {

        return new Faker(new Locale("ru")).name().lastName();
    }

    public static String getRandomEmailName() {
        return new Faker().internet().emailAddress();
    }

    public static String getRandomGender() {
        String[] genders = {
                "Male", "Female", "Other"
        };
        return new Faker().options().option(genders);
    }

    public static String getRandomPhoneNumber() {
        return new Faker().numerify("8#########");
    }

    public static String getRandomSubjects() {
        String[] hobbies = {
                "Math", "Chemistry", "Biology", "Social Studies"
        };
        return new Faker().options().option(hobbies);
    }

    public static String getRandomHobbies() {
        String[] hobbies = {
                "Sports", "Reading", "Music"
        };
        return new Faker().options().option(hobbies);
    }

    public static String getRandomMonth() {
        String[] month = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return new Faker().options().option(month);
    }

    public static String getRandomYears() {
        return new Faker().random().nextInt(1900, 2000).toString();
    }

    public static String getRandomPictures() {
        String[] hobbies = {
                "images.jpeg", "dog.jpeg", "cat.jpeg"
        };
        return new Faker().options().option(hobbies);
    }

    public static String getRandomMyCity() {
        return new Faker(new Locale("ru")).address().city();
    }

    public static String getRandomState() {
        String[] states = {
                "NCR", "Uttar Pradesh", "Haryana", "Rajasthan"
        };
        return new Faker().options().option(states);
    }

    public static String getRandomCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city = {
                        "Delhi", "Gurgaon", "Noida"
                };
                return new Faker().options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city = {
                        "Agra", "Lucknow", "Merrut"
                };
                return new Faker().options().option(city);
            }
            case "Haryana": {
                String[] city = {
                        "Karnal", "Panipat"
                };
                return new Faker().options().option(city);
            }
            case "Rajasthan": {
                String[] city = {
                        "Jaipur", "Jaiselmer"
                };
                return new Faker().options().option(city);
            }
        }
        return null;
    }

    public static String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }
}