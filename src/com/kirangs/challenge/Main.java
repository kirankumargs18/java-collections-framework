package com.kirangs.challenge;

import com.kirangs.Room;

public class Main {

    public static void main(String[] args) {

//        RoomService roomService = new RoomService();
//
//        roomService.createRoom("Room1", "AC", 2, 999.00);
//
//        roomService.createRoom("Room2", "Non AC", 2, 599.00);
//
//        System.out.println(roomService.getRooms());
//
//        System.out.println(roomService.getRooms().remove(new Room("Room2", "Non AC", 2, 599.00)));
//
//        System.out.println(roomService.getRooms());

        RoomService1 roomService1 = new RoomService1();

        roomService1.createRoom("Room1", "AC", 2, 999.00);

        roomService1.createRoom("Room1", "Non-AC", 2, 599.00);

        System.out.println(roomService1.getInventory());

        System.out.println(roomService1.getByType("AC"));

        System.out.println(roomService1.hasRoom(new Room("Room1", "AC", 2, 999.00)));

        Room[] rooms = roomService1.asArray();
        for (Room room : rooms) {
            System.out.println(room);
        }

        System.out.println(roomService1.getInventory());
    }
}
