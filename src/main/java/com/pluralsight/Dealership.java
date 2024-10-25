package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory = DealershipFileManager.getInventory();

    public Dealership() {
        this.name = "D & B Used Cars";
        this.address = "111 Old Benbrook Rd";
        this.phone = "817-555-5555";
    }

    public List<Vehicle> GetVehiclesByPrice(double min, double max) {
        List<Vehicle> filteredInventory = new ArrayList<>();
//        System.out.println("Searching for vehicles between $" + min + " and $" + max); //Used for debug

        for (Vehicle vehicle : inventory) {
            double price = vehicle.getPrice();
//            System.out.println("Checking vehicle with price: $" + price); //Used for debug
            if (price >= min && price <= max) {
                filteredInventory.add(vehicle);
//                System.out.println("Added vehicle to filtered list"); //Used for debug
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the price range");
        return filteredInventory;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> filteredInventory = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (make.equalsIgnoreCase(vehicle.getMake()) && model.equalsIgnoreCase(vehicle.getModel())) {
                filteredInventory.add(vehicle);
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the make/model request");

        return filteredInventory;
    }

    public List<Vehicle> GetVehiclesByYear(int minYear, int maxYear) {
        List<Vehicle> filteredInventory = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            double year = vehicle.getYear();
            if (year >= minYear && year <= maxYear) {
                filteredInventory.add(vehicle);
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the year range");

        return filteredInventory;
    }

    public List<Vehicle> GetVehiclesByColor(String color) {
        List<Vehicle> filteredInventory = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (color.equalsIgnoreCase(vehicle.getColor())) {
                filteredInventory.add(vehicle);
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the color request");

        return filteredInventory;
    }

    public List<Vehicle> GetVehiclesByMileage(int minMileage, int maxMileage) {
        List<Vehicle> filteredInventory = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            int mileage  = vehicle.getOdometer();
            if (mileage >= minMileage && mileage <= maxMileage) {
                filteredInventory.add(vehicle);
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the mileage range");

        return filteredInventory;
    }

    public List<Vehicle> GetVehiclesByVehicleType(String vehicleType) {
        List<Vehicle> filteredInventory = new ArrayList<>();

        for (Vehicle vehicle : inventory) {
            if (vehicleType.equalsIgnoreCase(vehicle.getVehicleType())) {
                filteredInventory.add(vehicle);
            }
        }

        System.out.println("Found " + filteredInventory.size() + " vehicles in the vehicle type request");

        return filteredInventory;
    }



}
