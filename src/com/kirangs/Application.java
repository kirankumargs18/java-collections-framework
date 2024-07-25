package com.kirangs;

import java.util.Collection;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        Room room1 = new Room("Room 1", "AC", 4, 1299.00);
        Room room2 = new Room("Room 2", "Non-AC", 4, 899.00);
        Room room3 = new Room("Room 3", "AC", 5, 1499.00);


//        double totalRevenue = getPotentialRevenue(room1, room2);
//        System.out.println(totalRevenue);

        /**
         * Now if we want to add new room and calculate the revenue
         * we have to add one more argument to the method "getPotentialRevenue" as third room
         * As this code is not extensible, we can make this code to work with any number of rooms
         * using collections
         *
         * let's see how we can change this code to adapt to a collection
         * */

//        Collection<Room> rooms = List.of(room1, room2, room3);
//        System.out.println("Total Revenue : " + getPotentialRevenue(rooms));

        Contract contract = new Implementation();

        printTerms(contract);


    }

    private static void printTerms(Contract contract) {

        contract.term1();
        contract.term2();
        contract.term3();
    }

    // this method works only for 2 rooms
//    private static double getPotentialRevenue(Room room1, Room room2) {
//        return room1.getRate() + room2.getRate();
//    }

    //this method works for any number of rooms (using Collections)
    private static double getPotentialRevenue(Collection<Room> rooms) {

//        return rooms.stream()
//                .mapToDouble(room -> room.getRate())
//                .sum();

        return rooms.stream()
                .mapToDouble(Room::getRate)
                .sum();
    }
}
