package com.kirangs;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

    private int id;

    private String name;

    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice() - o.getPrice();
    }
}

class Person {

    private int id;
    private String name;
    private String location;
    private int age;

    public Person(int id, String name, String location, int age) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }
}

public class SortingCollectionsDemo {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Kiran", "Bangalore", 26);
        Person person2 = new Person(1, "Kumar", "Kolar", 28);
        Person person3 = new Person(1, "G S", "Mulbagal", 30);
        Person person4 = new Person(1, "Nandish", "Bangalore", 24);

        List<Person> personList = new ArrayList<>();
        personList.addAll(List.of(person1, person2, person3, person4));

        //get person with min age and max age

        Comparator<Person> personAgeComparatorAsc = (p1, p2) -> p1.getAge() - p2.getAge();

        System.out.println("Person with max age : " + Collections.max(personList, personAgeComparatorAsc));
        System.out.println("Person with min age : " + Collections.min(personList, personAgeComparatorAsc));


//        Comparator<Person> personNameComparatorAsc = (p1, p2) -> p1.getName().compareTo(p2.getName());
//
//        //if search key is not found then it returns -n where n is the position it can be inserted to make the list sorted
//        //if found returns index of the key
////        int result = Collections.binarySearch(personList, new Person(10, "A Kumar", "Bangalore", 26), personNameComparatorAsc);
////        System.out.println("result : " + result);
//
//        int result = Collections.binarySearch(personList, person2, personNameComparatorAsc);
//        System.out.println("result : " + result);
//
//        //Comparator to sort based on Age
//        Comparator<Person> personAgeComparatorAsc = (p1, p2) -> p1.getAge() - p2.getAge();
//        Comparator<Person> personAgeComparatorDesc = (p1, p2) -> p2.getAge() - p1.getAge();
//
//        Comparator<Person> personAgeComparatorAsc1 = Comparator.comparing(person -> person.getAge());
//        Comparator<Person> personAgeComparatorDesc1 = Comparator.comparing(Person::getAge).reversed();
//
//        System.out.println("Before Sorting");
//        personList.forEach(SortingCollectionsDemo::printOnlyNameAndAge);
//
//        Collections.sort(personList, personAgeComparatorAsc);
//
//        System.out.println("\nAfter Sorting");
//        personList.forEach(SortingCollectionsDemo::printOnlyNameAndAge);
//
//        //Compartor to compare Name
//
//        Comparator<Person> personNameComparatorAsc1 = (p1, p2) -> p1.getName().compareTo(p2.getName());
//        Comparator<Person> personNameComparatorDesc = Comparator.comparing(Person::getName).reversed();
//
//        System.out.println("Before Sorting");
//        personList.forEach(SortingCollectionsDemo::printOnlyName);
//
//        Collections.sort(personList, personNameComparatorAsc);
//        personList.sort(personNameComparatorAsc);
//
//        Collections.sort(personList, personNameComparatorDesc);
//
//        System.out.println("\nAfter Sorting");
//        personList.forEach(SortingCollectionsDemo::printOnlyName);


    }


    private static void printOnlyNameAndAge(Person person) {

        System.out.println(person.getName() + " with age : " + person.getAge());
    }

    private static void printOnlyName(Person person) {
        System.out.println(person.getName());
    }
}
