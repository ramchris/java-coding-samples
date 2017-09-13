package com.ram.java8.examples;

import java.util.*;

public class SplitIteratorExample {
    public static void main(String[] args) {
        // Create a new Collection type; in this case an ArrayList
        Collection<Person> people = PersonFactory.get100Persons();

// simple iterator example
        Iterator<Person> peopleIterator = people.iterator();
        while(peopleIterator.hasNext()) {
            Person person = peopleIterator.next();
            System.out.println("Hello " + person.getFirstName() +
                    " " + person.getLastName() +
                    " from " + person.getState());
        }
        Spliterator<Person> personSpliterator = people.spliterator();

        System.out.println(personSpliterator.characteristics());

        System.out.println(personSpliterator.estimateSize());

        Spliterator<Person> spliterator = personSpliterator.trySplit();

        Collection<Person> italians;
        //italians = () -> people.stream().forEach(person -> person.getState().equalsIgnoreCase("Italy"));

        System.out.println(personSpliterator.estimateSize());
        System.out.println(spliterator.estimateSize());
    }

}
