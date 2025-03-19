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

    @Test
    void testCustomerConstructor() {
        Customer customer = new Customer();
        Customer customer2 = new Customer(1L, "Farrel");

        Assertions.assertNull(customer.getId());
        Assertions.assertNull(customer.getName());
        Assertions.assertEquals(1L, customer2.getId());
        Assertions.assertEquals("Farrel", customer2.getName());
    }
}