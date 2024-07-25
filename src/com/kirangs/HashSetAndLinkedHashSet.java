package com.kirangs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetAndLinkedHashSet {

    public static void main(String[] args) {


//        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
//        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
//        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
//        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
//
////        System.out.println(cambridge.hashCode()); //552070635
////        System.out.println(piccadilly.hashCode()); //46299544
////        System.out.println(oxfordDuplicate.hashCode()); //711706837
////        System.out.println(oxford.hashCode()); //711706837
//
//        Set<Room> rooms = new HashSet<>();
//        rooms.add(cambridge);
//        rooms.add(piccadilly);
//        rooms.add(oxford);
//        rooms.add(oxfordDuplicate);
//
//        rooms.stream()
//                .map(Room::getName)
//                .forEach(System.out::println);

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);


        Set<Room> rooms = new LinkedHashSet<>();
        rooms.add(cambridge);
        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);

        rooms.stream()
                .map(Room::getName)
                .forEach(System.out::println);

        Set<Room> rooms1 = Set.of(piccadilly, oxford);
//        rooms1.add(oxfordDuplicate);

        Set<Room> rooms2 = Set.copyOf(rooms);

        rooms2.stream()
                .forEach(System.out::println);


    }
}
