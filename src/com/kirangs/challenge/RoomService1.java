package com.kirangs.challenge;

import com.kirangs.Room;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RoomService1 {

    private Collection<Room> inventory;

    public RoomService1() {
        this.inventory = new LinkedHashSet<>();
    }

    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.

        return inventory.contains(room);
    }

    public Room[] asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.

        return inventory.toArray(new Room[inventory.size()]);
    }

    public Collection<Room> getByType(String type) {

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
        return inventory.stream().filter(room -> room.getType().equals(type)).collect(Collectors.toSet());

    }

    public Collection<Room> getInventory() {
        return new HashSet<>(this.inventory);
    }

    public void createRoom(String name, String type, int capacity, double price) {
        this.inventory.add(new Room(name, type, capacity, price));
    }

    public void createRooms(Room[] rooms) {
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {
        this.inventory.remove(room);
    }

}
