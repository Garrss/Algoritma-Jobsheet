package Jobsheet11;

public class Customer {
    String name;
    String address;
    String customerAccountNumber;

    public Customer(String name, String address, String customerAccountNumber) {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Account Number: " + customerAccountNumber;
    }
}