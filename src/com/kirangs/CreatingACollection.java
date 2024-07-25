package com.kirangs;

import java.util.*;

public class CreatingACollection {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Linux");
        collection.add("Java");
        collection.add("Java");

        Collection<String> collection1 = new HashSet<>(collection);

        System.out.println(collection1);
    }
}
