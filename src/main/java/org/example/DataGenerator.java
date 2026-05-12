package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<Auto> createAutos(List<Person> persons){
        List<Person> owners = new ArrayList<>();
        owners.add(persons.get(0));

        List<Person> authorizedDrivers = new ArrayList<>();
        authorizedDrivers.add(persons.get(1));

        Auto auto = new Auto(
                "Toyota",
                "Toyota Motor Corporation",
                "Corolla",
                "Sedan",
                2018,
                "JTDBR32E920123456",
                "White",
                "AA1234BB",
                "Good",
                owners,
                authorizedDrivers);

        List<Person> owners1 = new ArrayList<>();
        owners1.add(persons.get(3));

        List<Person> authorizedDrivers1 = new ArrayList<>();
        authorizedDrivers1.add(persons.get(3));
        authorizedDrivers1.add(persons.get(4));

        Auto auto1 = new Auto(
                "Mazda",
                "Mazda Motor Corporation",
                "CX-5",
                "SUV",
                2021,
                "JM3KFBCM0M1234567",
                "Red",
                "AA5864BХ",
                "Excellent",
                owners1,
                authorizedDrivers1);

        List<Person> owners2 = new ArrayList<>();
        owners2.add(persons.get(2));
        owners2.add(persons.get(6));

        List<Person> authorizedDrivers2 = new ArrayList<>();
        authorizedDrivers2.add(persons.get(2));
        authorizedDrivers2.add(persons.get(5));
        authorizedDrivers2.add(persons.get(6));

        Auto auto2 = new Auto(
                "GAZ",
                "Gorky Automobile Plant",
                "GAZelle Next",
                "Van",
                2008,
                "X96322105F1234567",
                "White",
                "AН1111НС",
                "Satisfactory",
                owners2,
                authorizedDrivers2);

        List<Person> owners3 = new ArrayList<>();
        owners3.add(persons.get(7));

        List<Person> authorizedDrivers3 = new ArrayList<>();
        authorizedDrivers3.add(persons.get(7));

        Auto auto3 = new Auto(
                "Toyota",
                "Toyota Motor Corporation",
                "Corolla",
                "Sedan",
                2012,
                "D96323264K7654321",
                "Green",
                "AК2222КА",
                "Good",
                owners3,
                authorizedDrivers3);

        List<Person> owners4 = new ArrayList<>();
        owners4.add(persons.get(8));

        List<Person> authorizedDrivers4 = new ArrayList<>();
        authorizedDrivers4.add(persons.get(8));

        Auto auto4 = new Auto(
                "Chevrolet",
                "General Motors",
                "Camaro",
                "Muscle car",
                2016,
                "P14923264KT134679",
                "Yellow",
                "АА0000АА",
                "Perfect",
                owners4,
                authorizedDrivers4);

        List<Person> owners5 = new ArrayList<>();
        owners5.add(persons.get(9));

        List<Person> authorizedDrivers5 = new ArrayList<>();
        authorizedDrivers5.add(persons.get(9));

        Auto auto5 = new Auto(
                "Chevrolet",
                "General Motors",
                "Corvette",
                "Sport car",
                2020,
                "VK9854167KT258741",
                "Red",
                "АХ4444АХ",
                "Perfect",
                owners5,
                authorizedDrivers5);

        List<Auto> autos = new ArrayList<>();
        autos.add(auto);
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        autos.add(auto4);
        autos.add(auto5);

       return autos;
    }
    public static List<Person> createPersons(){
        Person bogolyubov = new Person(
                "ВХК873654",
                "Боголюбов",
                "Валентин",
                "Петрович",
                LocalDate.of(1978, 5, 18),
                "м.Київ, вул.Виноградна, буд.118А, кв.54");

        Person pogrebnyak = new Person(
                "ВХК146325",
                "Погребняк",
                "Ярослав",
                "Олександрович",
                LocalDate.of(2000, 3, 8),
                "м.Київ, вул.Веселкова, буд.2А, кв.138");

        List<Person> owners = new ArrayList<>();
        owners.add(bogolyubov);
        owners.add(pogrebnyak);

        List<Person> authorizedDrivers = new ArrayList<>();
        authorizedDrivers.add(bogolyubov);
        authorizedDrivers.add(pogrebnyak);
        Person kyrylyuk = new Person(
                "ВХК962173",
                "Кирилюк",
                "Валентина",
                "Дмитрівна",
                LocalDate.of(1991, 1, 28),
                "м.Київ, вул.Пасічника, буд.11А, кв.4");

        Person kyrylyuk2 = new Person(
                "ВХК962173",
                "Кирилюк",
                "Віктор",
                "Федорович",
                LocalDate.of(1991, 7, 2),
                "м.Київ, вул.Пасічника, буд.11А, кв.4");

        List<Person> owners1 = new ArrayList<>();
        owners1.add(kyrylyuk);

        List<Person> authorizedDrivers1 = new ArrayList<>();
        authorizedDrivers1.add(kyrylyuk);
        authorizedDrivers1.add(kyrylyuk2);

        Person abubakarov = new Person(
                "ВХК168952",
                "Абубакаров",
                "Абубакар",
                "Абубакарович",
                LocalDate.of(2000, 3, 15),
                "м.Київ, вул.Пасічника, буд.174А, кв.78");

        Person rakhmedov = new Person(
                "ВХК174563",
                "Рахмедов",
                "Рахмед",
                "Рахмедович",
                LocalDate.of(2006, 12, 16),
                "м.Київ, вул.Пасічника, буд.174А, кв.78");

        Person vasylyuk = new Person(
                "ВХК241562",
                "Василюк",
                "Василь",
                "Васильович",
                LocalDate.of(1960, 8, 8),
                "м.Київ, вул.Шевченка, буд.10А, кв.100");

        List<Person> owners2 = new ArrayList<>();
        owners2.add(abubakarov);

        List<Person> authorizedDrivers2 = new ArrayList<>();
        authorizedDrivers2.add(abubakarov);
        authorizedDrivers2.add(rakhmedov);
        authorizedDrivers2.add(vasylyuk);

        Person klymenko = new Person(
                "ВХК239814",
                "Клименко",
                "Михайло",
                "Сергійович",
                LocalDate.of(1970, 6, 24),
                "м.Донецьк, вул.Київська, буд.8А, кв.180");

        List<Person> owners3 = new ArrayList<>();
        owners3.add(klymenko);

        List<Person> authorizedDrivers3 = new ArrayList<>();
        authorizedDrivers3.add(klymenko);

        Person kotsyba = new Person(
                "ВХЧ564217",
                "Коцюба",
                "Інна",
                "Володимирівна",
                LocalDate.of(2003, 7, 11),
                "м.Чернівці, вул.Львівська, буд.18, кв.45");

        List<Person> owners4 = new ArrayList<>();
        owners4.add(kotsyba);

        List<Person> authorizedDrivers4 = new ArrayList<>();
        authorizedDrivers4.add(kotsyba);

        Person bandera = new Person(
                "ВХЧ572643",
                "Бандера",
                "Степан",
                "Андрійович",
                LocalDate.of(2005, 1, 1),
                "м.Львів, вул.Старий Центр, буд.19, кв.55");

        List<Person> owners5 = new ArrayList<>();
        owners5.add(bandera);

        List<Person> authorizedDrivers5 = new ArrayList<>();
        authorizedDrivers5.add(bandera);

        List<Person> persons = new ArrayList<>();
        persons.add(bogolyubov);
        persons.add(pogrebnyak);
        persons.add(abubakarov);
        persons.add(kyrylyuk);
        persons.add(kyrylyuk2);
        persons.add(rakhmedov);
        persons.add(vasylyuk);
        persons.add(klymenko);
        persons.add(kotsyba);
        persons.add(bandera);

        return persons;
    }
}

