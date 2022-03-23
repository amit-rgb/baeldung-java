package com.baeldung.java.objectcopy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObjectCopyTests {

    @Test
    void testShallowCopy() {
        Customer A = new Customer("fName", "lName", new Address(123456, "address1", "address2", "city"));
        Customer B = Customer.getShallowCopyOfCustomerObject(A);
        B.getAddress()
            .setPincode(987654);
        assertEquals(987654, A.getAddress()
            .getPincode());

    }

    @Test
    void testDeepCopy() {
        Customer A = new Customer("fName", "lName", new Address(123456, "address1", "address2", "city"));
        Customer C = Customer.getDeepCopyOfCustomerObject(A);
        C.getAddress()
            .setCity("different-city");
        assertEquals("different-city", C.getAddress()
            .getCity());
        assertEquals("city", A.getAddress()
            .getCity());
    }
}
