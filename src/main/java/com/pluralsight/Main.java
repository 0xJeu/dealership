package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        /*  1 - Find vehicles within a price range
            2 - Find vehicles by make / model
            3 - Find vehicles by year range
            4 - Find vehicles by color
            5 - Find vehicles by mileage range
            6 - Find vehicles by type (car, truck, SUV, van)
            7 - List ALL vehicles
            8 - Add a vehicle
            9 - Remove a vehicle
            99 - Quit
            */

        Dealership dealership = new Dealership();
//
//        dealership.GetVehiclesByPrice()



        while (true) {
            System.out.printf("Welcome to %s's Auto Shop! \n", dealership.getName());
            UserInterface.display();
            int userInput = Integer.parseInt(keyboard.nextLine());
            System.out.println("-----------");
            switch (userInput) {
                case 1:
                    UserInterface.processGetByPriceRequest();
                    System.out.println("-----------");

                    break;
                case 2:
                    UserInterface.processGetByMakeModelRequest();
                    System.out.println("-----------");
                    break;
                case 3:
                    UserInterface.processGetByYearRequest();
                    System.out.println("-----------");
                    break;
                case 4:
                    UserInterface.processGetByColorRequest();
                    System.out.println("-----------");
                    break;
                case 5:
                    UserInterface.processGetByMileageRequest();
                    System.out.println("-----------");
                    break;
                case 6:
                    UserInterface.processGetByVehicleTypeRequest();
                    System.out.println("-----------");
                    break;
                case 7:
                    UserInterface.processGetAllVehiclesRequest();
                    System.out.println("-----------");
                    break;
                case 8:
                    UserInterface.processAddVehicleRequest();
                    System.out.println("-----------");
                    break;
                case 9:
                    UserInterface.processRemoveVehicleRequest();
                    System.out.println("-----------");
                    break;
                case 99:
                    System.exit(0);
            }
        }

    }


}
