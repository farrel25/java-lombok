package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegisterTest {

    @Test
    void testWithoutWith() {
        Register register1 = new Register("farrel", "secret");
        Register register2 = new Register("putra", "secret");

        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
        Assertions.assertEquals("putra", register2.getUsername());
        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
    }

    @Test
    void testWith() {
        Register register1 = new Register("farrel", "secret");
        Register register2 = register1.withUsername("putra").withPassword("secret");

        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
        Assertions.assertEquals("putra", register2.getUsername());
        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
    }
}