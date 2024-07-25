package com.kirangs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ClassCarComparisonTestsTest {

    Collection<Car> cars;

    Car suburu, honda, tesla;

    @BeforeEach
    void setUp(TestInfo testInfo) {

        System.out.format("%n Performing %s%n", testInfo.getTestMethod().get().getName());

        this.cars = new ArrayList<>();
        this.suburu = new Car("Suburu", "Impreza", 20);
        this.honda = new Car("Honda", "Civic", 25);
        this.tesla = new Car("Tesla", "Model S", 15);

        this.cars.addAll(Arrays.asList(suburu, tesla, honda));
    }

    @AfterEach
    void tearDown() {

        System.out.format("%nResults%n");

        this.cars.stream()
                .map(car -> String.format("%s %s", car.getMake(), car.getModel()))
                .forEach(System.out::println);
    }

    @Test
    public void removeTest() {

        this.cars.remove(honda);
        this.cars.remove(new Car("Suburu", "Impreza", 20)); // as this will be a new object with same content, this object doesn't exists in this.cars

        assertEquals(1, this.cars.size());

    }

    @Test
    public void containsTest() {

        assertTrue(this.cars.contains(honda));
        assertTrue(this.cars.contains(new Car("Honda", "Civic", 25)));
        assertTrue(this.cars.contains(suburu));
    }

    @Test
    public void removeAllIdentityTest() {

        this.cars.removeAll(Arrays.asList(honda, suburu, new Car("Tesla", "Model S", 15)));
        assertTrue(this.cars.size() == 0);


    }
}