package com.kirangs;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest bob = new Guest("Bob", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true); //loyalty program
        Guest siri = new Guest("Siri", "Doe", true); //loyalty program

//        //remove() throws no such element exception if queue is empty
//        Queue<Guest> guestQueue = new ArrayDeque<>();
////        Guest guest = guestQueue.remove();
//        //poll() returns null value
//        Guest guest = guestQueue.poll();
//        System.out.println(guest);

        //Normal Queue
//        Queue<Guest> guestQueue = new ArrayDeque<>();
//        guestQueue.offer(john);
//        guestQueue.offer(bob);
//        guestQueue.offer(sonia);
//        guestQueue.offer(siri);
//
//
//        print(guestQueue);
//
//        System.out.println(guestQueue.poll());
//
//        System.out.println(guestQueue.peek());
//
//        print(guestQueue);

        //PriorityQueue
        Comparator<Guest> guestComparator = Comparator.comparing(Guest::isLoyaltyProgramMember).reversed();

        Queue<Guest> guestQueue = new PriorityQueue<>(guestComparator);
        guestQueue.offer(john);
        guestQueue.offer(bob);
        guestQueue.offer(sonia);
        guestQueue.offer(siri);

        print(guestQueue);

        System.out.println(guestQueue.poll());

        System.out.println(guestQueue.peek());

        print(guestQueue);


    }

    public static void print(Queue<Guest> queue) {

        System.out.format("%n--Queue Contents--%n");

        int x = 0;
        for (Guest guest : queue) {
            System.out.format("%x: %s %s %n", x++, guest.getFirstName(), x == 1 ? "(Head)" : "");
        }

        System.out.println("");

    }
}
