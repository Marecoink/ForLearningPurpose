/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

import java.util.HashMap;

/**
 *
 * @author Maro
 */
public class Destination {

    private HashMap<String, String> flights;

    public Destination(String departure, String target) {
        this.flights = new HashMap<>();
        this.flights.putIfAbsent(departure, target);
    }

    @Override
    public String toString() {
        for (String departure : this.flights.keySet()) {
            return "(" + departure + "-" + this.flights.get(departure) + ")";
        }
        return null;
    }
}
