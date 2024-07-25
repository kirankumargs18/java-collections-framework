package com.kirangs.challenge;

import com.kirangs.Room;

import java.util.ArrayList;
import java.util.Collection;

public class RoomService {
    //1. Declare a collection to store room inventory
    private Collection<Room> rooms = null;
    public RoomService() {
        this.rooms = new ArrayList<>();
    }
    //2. Get room Inventory
    public Collection<Room> getRooms() {
        return new ArrayList<>(rooms);
    }
    //3. Add new room to the room inventory
    public void createRoom(String name, String type, int capacity, double rate) {

        rooms.add(new Room(name, type, capacity, rate));
    }
}
