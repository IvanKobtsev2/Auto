package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = DataGenerator.createPersons();

        List<Auto> autos = DataGenerator.createAutos(persons);

        autos.forEach(System.out::println);

        persons.forEach(System.out::println);

        autos.stream()
                .flatMap(auto -> auto.getOwners().stream())
                .forEach(System.out::println);

        autos.stream()
               .flatMap(auto -> auto.getAuthorizedDrivers().stream())
                .map(Person::getLastName)
                .forEach(System.out::println);

        autos.stream()
                .flatMap(auto -> auto.getOwners().stream())
                .map(Person::getLastName)
                .forEach(System.out::println);

        autos.stream()
                .flatMap(auto -> auto.getAuthorizedDrivers().stream())
                .filter(person -> person.getBirthDate().isAfter(LocalDate.now().minusYears(25)))
                .forEach(System.out::println);

        autos.stream()
                .filter(auto -> auto.getBrand().equals("Toyota"))
                .forEach(System.out::println);

        autos.stream()
                .filter(auto -> auto.getYear() > 2018)
                .forEach(System.out::println);

        autos.stream()
                .flatMap(auto -> auto.getAuthorizedDrivers().stream())
                .distinct()
                .forEach(System.out::println);

        autos.stream()
                .max((a1, a2) -> Integer.compare(a1.getAuthorizedDrivers().size(),
                        a2.getAuthorizedDrivers().size()))
               .ifPresent(System.out::println);

        autos.stream()
                .collect(groupingBy(Auto::getBrand,counting()))
                .forEach((brand, count) -> System.out.println(brand + " → " + count));

        autos.stream()
                .collect(groupingBy(Auto::getColor,counting()))
                .forEach((color, count) -> System.out.println(color + " → " + count));

        autos.stream()
                .map(auto -> auto.getBrand() + ":" + auto.getLicensePlate())
                .forEach(System.out::println);

        autos.stream()
                .map(Auto::getLicensePlate)
                .forEach(System.out::println);

        autos.stream()
                .min((a1, a2) -> Integer.compare(a1.getYear(), a2.getYear()))
                .ifPresent(System.out::println);

        autos.stream()
                .max((a1, a2) -> Integer.compare(a1.getYear(), a2.getYear()))
                .ifPresent(System.out::println);

    }
}