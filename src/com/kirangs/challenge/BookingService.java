package com.kirangs.challenge;

import com.kirangs.Guest;
import com.kirangs.Room;

import java.util.HashMap;
import java.util.Map;

public class BookingService {

    private Map<Room, Guest> bookings = new HashMap<>();

    public boolean book(Room room, Guest guest) {

        /*
         * 1. The provided Guest is placed in the bookings Map and
         * associated with the provided room, only if no other guest
         * is associated with the room.
         *
         * Returns a boolean that indicates if the Guest was
         * successfully placed in the room.
         */

//        if (!bookings.containsKey(room)) {
//            bookings.put(room, guest);
//            return true;
//        }
//        return false;

        return bookings.putIfAbsent(room, guest) == null;
    }

    public double totalRevenue() {

        /*
         * 2. Returns a double that totals the rate of each Room booked
         * in the bookings Map.
         */
        return bookings.keySet().stream().mapToDouble(room -> room.getRate()).sum();
    }

    public Map<Room, Guest> getBookings() {
        return bookings;
    }
}
