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
public class Plane {

    private String id;
    private int capacity;
    private HashMap<String, Plane> planesBase = new HashMap<>(); //move to new class flightControl; 

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void addPlane(String id, Plane plane) { //move to flightControll
        this.planesBase.putIfAbsent(id, plane);
    }

    public Plane getPlane(String idKey) { //move to flightControll
        return this.planesBase.get(idKey);
    }

}
