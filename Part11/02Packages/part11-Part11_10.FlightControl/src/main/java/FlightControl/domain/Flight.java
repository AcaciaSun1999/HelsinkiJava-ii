/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author lenovo
 */
import FlightControl.domain.Place;
import FlightControl.domain.Airplane;

public class Flight {
    
    private Airplane airplane;
    private Place departurePlace;
    private Place targetPlace;
    
    public Flight(Airplane airplane, Place departureAirport, Place targetAirport) {
        this.airplane = airplane;
        this.departurePlace = departureAirport;
        this.targetPlace = targetAirport;
    }

    
    public Airplane getAirplane(){
        return this.airplane;
    }
    
    public Place getDepaturePlace(){
        return this.departurePlace;
    }
    
    public Place getTargetPlace(){
        return this.targetPlace;
    }
    
    @Override
    public String toString(){
        return this.airplane + " (" + this.departurePlace + "-" + this.targetPlace + ")";
    }
}
