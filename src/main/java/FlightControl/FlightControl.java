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
    private HashMap<Destination, Plane> flights;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addPlane(String id, Plane plane) {
        this.airplanes.putIfAbsent(id, plane);
    }

    public void addFlight(Destination destination, Plane plane) {
        this.flights.putIfAbsent(destination, plane);
    }

    public Plane getPlane(String idKey) {
        return this.airplanes.get(idKey);
    }

    public void printAirplanes() {

    }
}
