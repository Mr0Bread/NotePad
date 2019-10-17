package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> personArrayList = new ArrayList<>(); // Array of created persons

    private int id;
    private String name;
    private String surname;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    static void createPerson() { // Create new person
        Person p = new Person();
        System.out.println("Input name:");
        String name = scanner.next();
        p.setName(name);

        System.out.println("Input surname:");
        String surname = scanner.next();
        p.setSurname(surname);

        System.out.println("Input phone number:");
        String phone = scanner.next();
        p.setPhone(phone);

        System.out.println("Person created!" + "\n");

        personArrayList.add(p);
    }

    static void showPersonOne(int id) { // Show persons data by ID
        Person p = personArrayList.get(id);

        System.out.println("Name: " + p.getName());
        System.out.println("Surname: " + p.getSurname());
        System.out.println("Phone: " + p.getPhone());

    }

    static void showPersonAll() {
        System.out.println("All created persons list:\n");

        personArrayList.stream().forEach(personArrayList -> System.out.println("Name: " + personArrayList.getName() +
                "\n" + "Surname: " + personArrayList.getSurname()
                + "\n" + "Phone number: "
                + personArrayList.getPhone()
                + "\n\n"));
    }

}
