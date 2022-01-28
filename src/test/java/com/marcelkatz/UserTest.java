package com.marcelkatz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    public void firstNameShouldNotBeEmpty() {
        User user = new User("Omar", "Gomez", "12345678901");
        Assertions.assertFalse(user.getFirstName().isEmpty());
    }

    @Test
    public void lastNameShouldNotBeEmpty() {
        User user = new User("Jamil", "Perez", "32145678901");
        Assertions.assertFalse(user.getLastName().isEmpty());
    }
}
