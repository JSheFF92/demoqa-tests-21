package com.demoqa.pages.utils;

import static com.demoqa.pages.utils.RandomUtils.*;
import static com.demoqa.pages.utils.RandomUtils.getRandomPictures;

public class TestDataParam {

    public static String
            firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            email = getRandomEmailName(),
            gender = getRandomGender(),
            phoneNumber = getRandomPhoneNumber(),
            hobby = getRandomHobbies(),
            fileName = getRandomPictures(),
            month = getRandomMonth(),
            year = getRandomYears(),
            day = getRandomDay(),
            address = getRandomMyCity(),
            subject = getRandomSubjects(),
            state = getRandomState(),
            city = getRandomCity(state);
}
