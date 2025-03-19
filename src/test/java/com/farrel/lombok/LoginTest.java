package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginTest {

    @Test
    void testConstructor() {
        Login login = Login.getInstance();
        Login login2 = Login.getInstance("farrel", "secret");

        Assertions.assertNull(login.getUsername());
        Assertions.assertNull(login.getPassword());
        Assertions.assertEquals("farrel", login2.getUsername());
        Assertions.assertEquals("secret", login2.getPassword());
    }
}