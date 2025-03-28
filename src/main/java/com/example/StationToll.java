package com.example;

import java.util.ArrayList;
import java.util.List;

public class StationToll {
    private String name;
    private String city;
    private int totalAmount;
    private List<Vehicle> vehicles;


    public StationToll(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalAmount = 0;
        this.vehicles = new ArrayList<>();
    }

    public void processVehicle(Vehicle vehicle) {
        int toll = vehicle.calculateToll();
        totalAmount += toll;
        vehicles.add(vehicle);
    }
    public int getTotalAmount(){
        return totalAmount;

    }
    public List <Vehicle> getVehicles(){
        return vehicles;
    }

    public void printTollInfo() {
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName() + ": " + v.getLicensePlate());
        }
        System.out.println("Total recaudado: " + totalAmount);
    }

}

