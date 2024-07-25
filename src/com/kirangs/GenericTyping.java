package com.kirangs;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTyping {

    public static void main(String[] args) {

//        Collection collection = new ArrayList(); //raw collection
//        collection.add("Kiran");
//        collection.add(new Room("Room 1", "AC", 4, 1299.00));
//
//        System.out.println(collection);

        //issue with processing ( need to type cast each object to it's respective type to process it )

        Collection<Room> collection = new ArrayList<>();
//        collection.add("Kiran"); //compile error as we are trying to add String object
        collection.add(new Room("Room 1", "AC", 4, 1299.00));

        collection.stream().map(Room::getName).forEach(System.out::println);

        System.out.println(collection);

        //Object Comparison

        String str1 = new String("Kiran");
        String str2 = new String("Kiran");

        System.out.println(str1 == str2); //references will be compared
        System.out.println(str1.equals(str2)); //actual values(content) will be compared
    }
}
