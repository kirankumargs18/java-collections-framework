package com.kirangs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {

        Guest john = new Guest("John", "Doe", false);
        Guest maria = new Guest("Maria", "Doe", false);
        Guest sonia = new Guest("Sonia", "Doe", true);
        Guest siri = new Guest("Siri", "Doe", true);

        List<Guest> guestList = new ArrayList<>(100);
        guestList.add(john);
        guestList.add(maria);

        guestList.add(0, sonia);
        guestList.add(0, siri);

        guestList.get(3).setLoyaltyProgramMember(true);

        print(guestList);

    }

    public static void print(List<Guest> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Guest guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }

    }
}
