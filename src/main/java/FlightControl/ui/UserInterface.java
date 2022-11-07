/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.FlightControl;
import FlightControl.domain.Plane;  // check FlightControl.* later
import FlightControl.domain.Destination;
import java.util.Scanner;

/**
 *
 * @author Maro
 */
public class UserInterface {

    private Scanner scanner;
    FlightControl flightControl = new FlightControl();

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        AirportAssetControl();
        System.out.println();
        FlightControl();
    }

    public void AirportAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            try {
                String input = scanner.nextLine();
                if (input.equals("x")) {
                    break;
                } else if (input.equals("1")) { //move text/scanner to addPlane in FlightControl class?
                    System.out.println("Give the airplane id:");
                    String planeID = scanner.nextLine();
                    System.out.println("Give the airplane capacity:");
                    String planeCap = scanner.nextLine();
                    this.flightControl.addPlane(planeID, new Plane(planeID, Integer.valueOf(planeCap)));
                } else if (input.equals("2")) { // as above? -> it should look like FlightControl() method
                    System.out.println("Give the airplane id: ");
                    String planeID = scanner.nextLine();
                    try { // if given ID doesn't exist
                        String planeNewFlight = this.flightControl.getPlane(planeID).getId();
                        System.out.println("Give the departure airport id: ");
                        String departure = scanner.nextLine();
                        System.out.println("Give the target airport id: ");
                        String target = scanner.nextLine();
                        this.flightControl.addFlight(new Destination(departure, target), planeNewFlight);
                    } catch (Exception e) {
                        System.out.println("Error: There is no plane with that ID in databse");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void FlightControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                //       System.out.println("Bye");
                break;
            } else if (input.equals("1")) {
                this.flightControl.printAirplanes();
            } else if (input.equals("2")) {
                this.flightControl.printFlights();
            } else if (input.equals("3")) {
                System.out.println("Give the airplane id:");
                this.flightControl.printPlane(scanner.nextLine());
            }

        }
    }
}
