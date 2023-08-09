package com.demoqa.pages.utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {


    public static void main(String[] args) {
//        System.out.println(getRandomString(10));
//        System.out.println(getRandomString(10));
//        System.out.println(getRandomEmail());
//        System.out.println(getRandomInt(111, 99999999));
//        System.out.println(getRandomPhone());
//        System.out.println(getRandomGender());
        System.out.println(getRandomDay());
    }

    public static String getRandomString(int len) {
//        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));

        return sb.toString();
    }

//    public static String getRandomEmail() {
//        return getRandomString(15) + "@qa.guru";
////        return getRandomString(15) + "@" + getRandomString(5) + "." + getRandomString(5);
////        return String.format("%s@%s.%s", getRandomString(15),
////                getRandomString(5), getRandomString(5));
//    }

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    // +3 (263) 253 - 66 - 12
    public static String getRandomPhone() {
        return String.format("+%s (%s) %s - %s - %s", getRandomInt(1, 9), getRandomInt(111, 999),
                getRandomInt(111, 999), getRandomInt(11, 99), getRandomInt(11, 99));
    }


    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);

        return array[index];
    }

    //Faker
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