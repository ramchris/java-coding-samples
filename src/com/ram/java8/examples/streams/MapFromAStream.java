package com.ram.java8.examples.streams;

import com.ram.java8.examples.Person;
import com.ram.java8.examples.PersonFactory;

import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromAStream {

    public static void main(String[] args) {
        Map<String, List<Person>> ssn =PersonFactory.get100Persons().stream().collect(Collectors.groupingBy(Person::getState));
        System.out.println(ssn);

        Set<Person> ssnSet =PersonFactory.get100Persons().stream().collect(Collectors.toSet());
        System.out.println(ssnSet);

    }
}
