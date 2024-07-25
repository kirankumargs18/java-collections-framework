package com.kirangs;

import java.util.Arrays;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        Collection<Integer> integers = Arrays.asList(3, 1, 7, 8, 2, 4, 6, 5);
        NavigableSet<Integer> integerNavigableSet = new TreeSet<>(integers);

        System.out.println(integerNavigableSet.lower(6));
        System.out.println(integerNavigableSet.higher(4));

        integerNavigableSet.subSet(2, 7)
                .forEach(System.out::println);

        integerNavigableSet.tailSet(4, true)
                .forEach(System.out::println);

        integerNavigableSet.headSet(4)
                .forEach(System.out::println);

        integerNavigableSet.forEach(System.out::println);
    }

}
