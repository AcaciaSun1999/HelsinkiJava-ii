/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author lenovo
 */

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class FlightControl {
    private Map<String, Airplane>airplaneList;
    private Map<String, Flight>flightList;
    private Map<String, Place>placeList;
    
    public FlightControl(){
        this.airplaneList = new HashMap<>();
        this.flightList = new HashMap<>();
        this.placeList = new HashMap<>();
    }
    
    public void addAirplane(String id, int capacity){
        Airplane airplane = new Airplane(id, capacity);
        this.airplaneList.put(id,airplane);
    }
    
    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.placeList.putIfAbsent(departureID, new Place(departureID));
        this.placeList.putIfAbsent(destinationID, new Place(destinationID));
        Flight flight = new Flight(plane, this.placeList.get(departureID),this.placeList.get(destinationID));
        this.flightList.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes(){
        Collection<Airplane> airplanes = airplaneList.values();
        return airplanes;
    }
    
    public Collection<Flight> getFlights(){
        Collection<Flight>flights = flightList.values();
        return flights;
    }
    
    public Airplane getAirplane(String id){
        return this.airplaneList.get(id);
    }
    public void printAirplanes(){
        System.out.println(this.getAirplanes());
    }
    
    public void printFlights(){
        System.out.println(this.getFlights());
    }
    
    public void printAirplaneDetail(String ID){
        System.out.println(this.getAirplane(ID));
    }
}
