package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource({
            "validUser, true",
            "user123, true",
            "user.name, true",
            "user-name, true",
            "user_name, true",
            "us, false",  // Too short name
            "u@ser, false",  // The @ sign is not permitted
            "user!, false",  // The ! sign is not permitted
            "user space, false",  // The space character is not allowed
            "123, true"  // The number itself is allowed
    })
    void shouldValidateUsername(String username, boolean expected) {
        assertEquals(expected, validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource({
            "email@example.com, true",
            "firstname.lastname@example.com, true",
            "email@subdomain.example.com, true",
            "123456@example.com, true",
            "email@example, false",  // Lack of a main domain
            "plainaddress, false",  // Lack of @
            "@missingusername.com, false",  // Lack of username
            "email.@example.com, false",  // Dot at the end of the username
            "email..email@example.com, false",  // Two dots in the username
            "email@example..com, false"  // Two dots in the domain
    })
    void shouldValidateEmail(String email, boolean expected) {
        assertEquals(expected, validator.validateEmail(email));
    }
}

