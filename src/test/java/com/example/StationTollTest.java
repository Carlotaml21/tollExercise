package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StationTollTest {
    @Test
    public void testAddCarToTollStation(){
        StationToll station = new StationToll("peaje 1", "Asturias");
        Vehicle car = new Car ("1234");

        station.processVehicle(car);

        assertEquals(100,station.getTotalAmount());
    }

    @Test
    public void testAddMotorcycleToTollStation(){
        StationToll station = new StationToll("peaje 2", "Cantabria");
        Vehicle motorcycle = new Motorcycle ("5678");

        station.processVehicle(motorcycle);

        assertEquals(50,station.getTotalAmount());
    }

    @Test
    public void testAddTruckToTollStation(){
        StationToll station = new StationToll("peaje 3", "Galicia");
        Vehicle truck = new Truck("1928", 4);

        station.processVehicle(truck);

        assertEquals(200,station.getTotalAmount());
    }


}
