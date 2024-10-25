package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

import static com.pluralsight.Main.keyboard;

public class DealershipFileManager {


    public static Dealership getDealership(){
        Dealership dealership = new Dealership();

        try {
            FileReader fr = new FileReader("src/main/resources/inventory.csv");
            // create a BufferedReader to manage input stream
            BufferedReader br = new BufferedReader(fr);
            String input;
            // read until there is no more data
            while ((input = br.readLine()) != null) {
                if (input.startsWith("D & B Used Cars")){
                    continue;
                }

                String[] lineSplit = input.split(Pattern.quote("|"));
                int vin = Integer.parseInt(lineSplit[0]);
                int year = Integer.parseInt(lineSplit[1]);
                String make = lineSplit[2];
                String model = lineSplit[3];
                String vehicleType = lineSplit[4];
                String color = lineSplit[5];
                int odometer = Integer.parseInt(lineSplit[6]);
                double price = Double.parseDouble(lineSplit[7]);


                dealership.addVehicle(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }

    public static void saveInventory(Dealership dealership) {
        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/inventory.csv"));

            for (Vehicle vehicle : dealership.getAllVehicles()) {
                //Format inventory entry and write to file
                String inventoryEntry = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f\n",vehicle.getVin(),vehicle.getYear(),vehicle.getMake(),vehicle.getModel(),vehicle.getVehicleType(),vehicle.getColor(), vehicle.getOdometer(),vehicle.getPrice());
                bufWriter.write(inventoryEntry);
            }

            //Release file
            bufWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
