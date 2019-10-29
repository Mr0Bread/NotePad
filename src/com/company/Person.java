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

        name = Asker.askString("Input name: ");
        surname = Asker.askString( "Input surname: ");
        phone = Asker.askString("Input phone number: ");
        email = Asker.askString("Input e-mail: ");

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
