package com.ram.java8.examples;
import java.util.ArrayList;
import java.util.List;

public class PersonFactory {

    public static Person getPerson() {
        Person p = new Person("Nithil", "ramkumar", "IL", "07-07-1999","808-08-2323");
        return p;
    }

    public static List<Person> get100Persons() {
        List<Person> persons = new ArrayList<Person>(100);
        Person p = null;
        long ssn = 0;

        for(int i =0; i<30;i++) {
            p = new Person();
            p.setFirstName("Nithil" + i);
            p.setLastName("Krishnan");
            p.setDob("01-10-1970");
            p.setState("IL");
            ssn = 606065330 + i;
            p.setSsn(String.valueOf(ssn));
            persons.add(p);
        }
        for(int i =0; i<30;i++) {
            p = new Person();
            p.setFirstName("Nithil" + i);
            p.setLastName("Krishnan");
            p.setDob("01-10-1975");
            p.setState("CA");
            ssn = 202023420 + i;
            p.setSsn(String.valueOf(ssn));
            persons.add(p);
        }

        for(int i =0; i<30;i++) {
            p = new Person();
            p.setFirstName("Nithil" + i);
            p.setLastName("Krishnan");
            p.setDob("01-10-1960");
            p.setState("TX");
            ssn = 404043420 + i;
            p.setSsn(String.valueOf(ssn));
            persons.add(p);
        }

        for(int i =0; i<30;i++) {
            p = new Person();
            p.setFirstName("Nithil" + i);
            p.setLastName("Krishnan");
            p.setDob("10-10-1977");
            p.setState("NY");
            ssn = 101016420 + i;
            p.setSsn(String.valueOf(ssn));
            persons.add(p);
        }
        return persons;
    }
}
