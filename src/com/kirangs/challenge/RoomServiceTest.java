package com.kirangs.challenge;

import com.kirangs.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RoomServiceTest {

    private RoomService roomService = new RoomService();


    @BeforeEach
    void setUp(TestInfo testInfo) {
        roomService.createRoom("Room1", "AC", 2, 999.00);
        roomService.createRoom("Room2", "Non AC", 2, 599.00);

    }

    @Test
    void addRoomTest(TestInfo testInfo) {

        System.out.format("%nExecuting %s%n", testInfo.getTestMethod().get().getName());
        Collection<Room> rooms1 = roomService.getRooms();
        roomService.createRoom("Room3", "Non AC", 2, 599.00);
        assertEquals(3, roomService.getRooms().size());
    }

    @Test
    void testGetRoomsNotReturningOriginalList(TestInfo testInfo) {

        System.out.format("%nExecuting %s%n", testInfo.getTestMethod().get().getName());

        Collection<Room> rooms = roomService.getRooms();
        rooms.add(new Room("Room3", "Non AC", 2, 599.00));

        assertNotEquals(roomService.getRooms().size(), rooms.size());
    }

}