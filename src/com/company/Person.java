package com.company;

public class Person extends Record {

    private String name;
    private String surname;
    private String phone;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void askInfo() { // Create new person
        System.out.println("Input name:");
        name = Main.scanner.next();

        System.out.println("Input surname:");
        surname = Main.scanner.next();

        System.out.println("Input phone number:");
        phone = Main.scanner.next();

        System.out.println("Input e-mail:");
        email = Main.scanner.next();

        System.out.println("Person created!" + "\n");
    }

    @Override
    public boolean contains(String str) {
        return name.contains(str)
                || surname.contains(str)
                || phone.contains(str)
                || email.contains(str)
                || super.contains(str);
    }

}
