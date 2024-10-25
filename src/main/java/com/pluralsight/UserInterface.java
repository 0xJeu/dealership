package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    public static Scanner keyboard = new Scanner(System.in);
    public static Dealership dealership = new Dealership();

        private UserInterface() {
    }

    public void display() {

    }

    public static void processGetByPriceRequest() {


        System.out.print("Please enter the minimum price: ");
        double min = Double.parseDouble(keyboard.nextLine().trim());

        System.out.print("Please enter the maximum price: ");
        double max = Double.parseDouble(keyboard.nextLine().trim());

//        System.out.println(dealership.GetVehiclesByPrice(min, max));

        for (Vehicle vehicle : dealership.GetVehiclesByPrice(min, max)) {
            vehicle.displayVehicleInfo();
        }

    }

    public static void processGetByMakeModelRequest() {
        System.out.print("Please enter the make of the vehicle: ");
        String  make = keyboard.nextLine().trim();

        System.out.print("Please enter the model of the vehicle: ");
        String  model = keyboard.nextLine().trim();

        for (Vehicle vehicle : dealership.getVehiclesByMakeModel(make, model)) {
            vehicle.displayVehicleInfo();
        }

    }

    public static void processGetByYearRequest() {
        System.out.print("Please enter the minimum year of the vehicle: ");
        int minYear = Integer.parseInt(keyboard.nextLine().trim());

        System.out.print("Please enter the maximum year of the vehicle: ");
        int maxYear = Integer.parseInt(keyboard.nextLine().trim());

        for (Vehicle vehicle : dealership.GetVehiclesByYear(minYear, maxYear)) {
            vehicle.displayVehicleInfo();
        }
    }

    public static void processGetByColorRequest() {
        System.out.print("Please enter the color of the vehicle: ");
        String  color = keyboard.nextLine().trim();

        for (Vehicle vehicle : dealership.GetVehiclesByColor(color)) {
            vehicle.displayVehicleInfo();
        }
    }

    public static void processGetByMileageRequest() {
        System.out.print("Please enter the minimum mileage of the vehicle: ");
        int minMileage = Integer.parseInt(keyboard.nextLine().trim());

        System.out.print("Please enter the maximum mileage of the vehicle: ");
        int maxMileage = Integer.parseInt(keyboard.nextLine().trim());

        for (Vehicle vehicle : dealership.GetVehiclesByMileage(minMileage, maxMileage)) {
            vehicle.displayVehicleInfo();
        }
    }

    public static void processGetByVehicleTypeRequest() {

    }

    public static void processGetAllVehiclesRequest() {

    }

    public static void processAddVehicleRequest() {

    }

    public static void processRemoveVehicleRequest() {

    }
}
