package com.kirangs;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IteratingCollection {

    public static void main(String[] args) {

        Room room1 = new Room("Room 1", "AC", 4, 1299.00);
        Room room2 = new Room("Room 2", "Non-AC", 4, 899.00);
        Room room3 = new Room("Room 3", "AC", 5, 1499.00);
        room1.setPetFriendly(true);
        room2.setPetFriendly(false);
        room3.setPetFriendly(true);

        Collection<Room> rooms = new ArrayList<>();
        rooms.addAll(Arrays.asList(room1, room2, room3));

        //Iterator
        Iterator<Room> iterator = rooms.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collection<Integer> integers = new HashSet<>();
        integers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> iterator1 = integers.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        //Enhanced for loop
        for (Room room : rooms) {
            System.out.println(room);
        }

        //forEach
        rooms.forEach(room -> System.out.println(room));

        //modifying collection while iterating using For and Iterator

        //Using For loop

        /**
         * Exception in thread "main" java.util.ConcurrentModificationException
         * 	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
         * 	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
         * 	at com.kirangs.IteratingCollection.main(IteratingCollection.java:43)
         *
         * 	we will get above error for below for loop as we are iterating and modifying the object simultaneously
         * */

//        for (Room room : rooms) {
//            if (room.isPetFriendly()) {
//                rooms.remove(room);
//            }
//        }

        //To avoid above problem we can create new collection, get the rooms to be removed in this collection like as show below
        Collection<Room> rooms1 = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isPetFriendly()) {
                rooms1.add(room);
            }
        }
        //here we can remove the rooms here
        rooms.removeAll(rooms1);

        System.out.println("\n" + rooms);

        //Let's see how we can do above things using Iterator
        Iterator<Room> iterator2 = rooms.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().isPetFriendly()) {
                iterator2.remove();
            }
        }
        System.out.println("\n" + rooms);

        //Accessing collection through streams

//        rooms.stream()
//                .filter(new Predicate<Room>() {
//                    @Override
//                    public boolean test(Room room) {
//                        System.out.format("%n Testing %s with result %b%n", room.getName(), room.isPetFriendly());
//                        return room.isPetFriendly();
//                    }
//                })
//                .forEach(new Consumer<Room>() {
//                    @Override
//                    public void accept(Room room) {
//                        System.out.format("%nPrinting %s%n", room.getName());
//                        System.out.println(room);
//                    }
//                });

        //using lamnda expression

//        rooms.stream()
//                .filter(room -> room.isPetFriendly())
//                .forEach(room -> System.out.println(room));

        //method references

        rooms.stream()
                .filter(Room::isPetFriendly)
                .forEach(System.out::println);


    }
}
