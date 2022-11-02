/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

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

        }
    }

    private void FlightControl() {
    }

}
