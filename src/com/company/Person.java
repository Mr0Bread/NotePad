package com.company;

import java.util.ArrayList;

public class Person extends Record {

    static ArrayList<Person> personArrayList = new ArrayList<>(); // Array of created persons

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

    static void createPerson() { // Create new person
        Person p = new Person();
        System.out.println("Input name:");
        String name = Main.scanner.next();
        p.setName(name);

        System.out.println("Input surname:");
        String surname = Main.scanner.next();
        p.setSurname(surname);

        System.out.println("Input phone number:");
        String phone = Main.scanner.next();
        p.setPhone(phone);

        System.out.println("Input e-mail:");
        String email = Main.scanner.next();
        p.setEmail(email);

        System.out.println("Person created!" + "\n");

        personArrayList.add(p);
    }

    static void showPersonOne(int id) { // Show persons data by ID
        Record p = personArrayList.get(id);

//        System.out.println("ID: " + p.getId());
//        System.out.println("Name: " + p.getName());
//        System.out.println("Surname: " + p.getSurname());
//        System.out.println("Phone: " + p.getPhone());
//        System.out.println("E-mail: " + p.getEmail());

        System.out.println(p);

    }

    static void showPersonAll() {
        System.out.println("All created persons list:\n");

        personArrayList.stream().forEach(personArrayList -> System.out.println(personArrayList.toString()));
    }

}
