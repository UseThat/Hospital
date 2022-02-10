package model;

public class Patient {
    private String firstName;
    private String lastName;
    private String document;
    private int age;

    public Patient(String firstName, String lastName, String document, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.document = document;
        this.age = age;
    }

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + ", "+lastName + " Age: "+age+" Document number: "+document;
    }
}
