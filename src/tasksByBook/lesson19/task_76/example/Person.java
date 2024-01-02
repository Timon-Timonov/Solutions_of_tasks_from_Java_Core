package tasksByBook.lesson19.task_76.example;

import java.util.List;

public class Person {
    private  String firstName;
    private String lastName;
    private Address address;
    private List<Long>phoneNumbers;


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

    public List<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
