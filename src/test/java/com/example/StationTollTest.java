package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StationTollTest {
    @Test
    public void testAddCarToTollStation(){
        StationToll station = new StationToll("peaje 1", "Asturias");
        vehicle car = new Car ("1234");

        station.processVehicle(car);

        assertEquals(100,station.getTotalAmount());
    }
}
