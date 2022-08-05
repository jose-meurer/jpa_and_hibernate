package application;

import model.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person(1, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(2, "Joaquim Torres", "joaquim@gmail.com");
        Person p3 = new Person(3, "Ana Maria", "ana@gmail.com");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        personList.forEach(System.out::println);
    }
}
