/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.util.HashMap;
import FlightControl.domain.*;

/**
 *
 * @author Maro
 */
public class FlightControl {

    private HashMap<String, Plane> airplanes;
    private HashMap<Destination, String> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addPlane(String id, Plane plane) {
        this.airplanes.putIfAbsent(id, plane);
    }

    public void addFlight(Destination destination, String plane) {
        this.flights.putIfAbsent(destination, plane);
    }

    public Plane getPlane(String idKey) {
        return this.airplanes.get(idKey);
    }

    public String getPlaneToDestination(Destination destination) {
        return this.flights.get(destination);
    }

    public void printPlane(String planeID) {
        System.out.println(getPlane(planeID));
    }

    public void printAirplanes() {
        for (String plane : this.airplanes.keySet()) {
            printPlane(plane);
        }
    }

    public void printFlights() {
        for (Destination destination : this.flights.keySet()) {
            System.out.println(getPlane(this.getPlaneToDestination(destination)) + " " + destination.toString());
        }
    }
}
