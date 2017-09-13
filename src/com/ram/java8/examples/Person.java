package com.ram.java8.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Person {
    String firstName;
    String lastName;
    String state;
    private String dob;
    private String ssn;


    public Person(String firstName, String lastName, String state, String dob, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.dob  = dob;
        this.ssn = ssn;
    }

    public Person() {

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public boolean is18() {
        LocalDate currentDate = LocalDate.now();
        LocalDate  date= getDate(dob);
        LocalDate dateofbirth = getDate(dob);

        long period = Math.abs(ChronoUnit.YEARS.between(currentDate, dateofbirth) );
        System.out.println(period);

        return  period >= 18 ? true : false;
    }

    public static void main(String[] args) {
        Person p = new Person("Nithil", "ramkumar", "IL", "07-07-1999","808-08-2323");
    }

    public LocalDate getDate(String date) {

        DateTimeFormatter dateFormatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date,dateFormatter);
    }
}
