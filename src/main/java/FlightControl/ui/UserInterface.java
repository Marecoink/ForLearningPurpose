/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.domain.Plane;
import java.util.Scanner;

/**
 *
 * @author Maro
 */
public class UserInterface {

    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        AirportAssetControl();
        FlightControl();
    }

    public void AirportAssetControl() {
        while (true) {
            System.out.println("Chose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            String input = scanner.nextLine();
//            try {
            if (input.equals("x")) {
                System.out.println("this will move to FlightControl method"); // FlightControl to be added
                break;
            } else if (input.equals("1")) {
                System.out.println("Plane adding test start");
                System.out.println("Give the airplane id");
                String planeID = scanner.nextLine();
                System.out.println("Give the airplane capacity");
                String planeCap = scanner.nextLine();
//                Plane newPlane = new Plane(planeID, Integer.valueOf(planeCap)); //get from flightControl
//                newPlane.addPlane(planeID, newPlane);
//                System.out.println(newPlane.getPlane(planeID));
            } else if (input.equals("2")) {
                System.out.println("Flight will be added");//add later on FC.domain - Flight
            }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//            }
        }
    }

    private void FlightControl() {
        while (true) {
            System.out.println("Chose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                System.out.println("Bye"); // FlightControl to be added
                break;
            } else if (input.equals("1")) {
                System.out.println("Planes will be printed");//printAllPlanes();

            } else if (input.equals("2")) {
                System.out.println("Flights will be printed");//printAllFlights();
            } else if (input.equals("3")) {
                System.out.println("Give the airplane id: ");//scanner -> matches hashmap key -> print
            }

        }
    }
}
