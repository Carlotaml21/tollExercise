package com.example;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

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

    @Test
    public void testPrintTollInfo() {
        StationToll station = new StationToll("Peaje 4", "Oviedo");
        station.processVehicle(new Car("1234"));
        station.processVehicle(new Motorcycle("5678"));
        station.processVehicle(new Truck("1928", 4));


        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        station.printTollInfo();

        System.setOut(System.out);

        String output = outContent.toString();

        assertTrue(output.contains("Car: 1234"));
        assertTrue(output.contains("Motorcycle: 5678"));
        assertTrue(output.contains("Truck: 1928"));
        assertTrue(output.contains("Total recaudado: 300"));
    }
}
