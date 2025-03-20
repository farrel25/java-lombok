package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemberTest {

    @Test
    void testConstructorNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(null, null);
        });
    }

    @Test
    void testSetIdNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(1L, "Farrel");

            member.setId(null);
        });
    }

    @Test
    void testSetNameNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(1L, "Farrel");

            member.setName(null);
        });
    }

    @Test
    void testSayHelloNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(1L, "Farrel");

            member.sayHello(null);
        });
    }
}