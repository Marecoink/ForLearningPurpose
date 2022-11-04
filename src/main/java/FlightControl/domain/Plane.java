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

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

}
