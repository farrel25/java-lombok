package com.farrel.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerTest {

    @Test
    void testCustomer() {
        Customer customer = new Customer();
        customer.setId(100L);
        customer.setName("Farrel");

        Assertions.assertEquals(100L, customer.getId());
        Assertions.assertEquals("Farrel", customer.getName());
    }
}