package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class DealershipFileManager {


    public static ArrayList<Vehicle> getInventory(){
        ArrayList<Vehicle> inventory = new ArrayList<>();

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


                inventory.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return inventory;
    }

}
