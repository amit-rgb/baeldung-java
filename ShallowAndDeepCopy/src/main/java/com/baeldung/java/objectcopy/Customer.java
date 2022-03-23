package com.baeldung.java.objectcopy;

class Customer {
    private String firstName;
    private String lastName;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Customer(String fName, String lName, Address address) {
        this.firstName = fName;
        this.lastName = lName;
        this.address = address;
    }

    public static Customer getShallowCopyOfCustomerObject(Customer c) {
        return c;
    }

    public static Customer getDeepCopyOfCustomerObject(Customer c) {
        Customer deepCopy = new Customer(c.getFirstName(), c.getLastName(), new Address(c.getAddress()
            .getPincode(), c.getAddress()
            .getAddressLine1(), c.getAddress()
            .getAddressLine2(), c.getAddress()
            .getCity()));

        return deepCopy;
    }
}