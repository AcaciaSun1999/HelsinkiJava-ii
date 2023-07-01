/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author lenovo
 */

import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

public class ui {
    
    private Scanner scanner;
    private FlightControl flightControl;
    public ui(FlightControl flightControl, Scanner scanner){
        this.flightControl = flightControl;
        this.scanner = scanner;
    }
    
    public void start(){
        airplaneAssertControl();
        airplaneControl();
        
    }
    
    public void airplaneAssertControl(){
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while(true){
            System.out.println("Choose an action:\n" +
                                "[1] Add an airplane\n" +
                                "[2] Add a flight\n" +
                                "[x] Exit Airport Asset Control");
            System.out.print("> ");
            String action = scanner.nextLine();
            if(action.equals("x")){
                break;
            }
            if(action.equals("1")){
                addAirplane();
            }
            if(action.equals("2")){
                addFlight();
            }
        }
    }
    
    public void airplaneControl(){
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while(true){
            System.out.println("Choose an action:\n" +
                                "[1] Print airplanes\n" +
                                "[2] Print flights\n" +
                                "[3] Print airplane details\n" +
                                "[x] Quit");
            System.out.print("> ");
            String action = scanner.nextLine();
            if(action.equals("x")){
                break;
            }
            if(action.equals("1")){
                printAirplanes();
            }
            if(action.equals("2")){
                printFlights();
            }
            if(action.equals("3")){
                printAirplaneDetail();
            }
        }
    }
    
    public void addAirplane(){
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int capacity = Integer.valueOf(scanner.nextLine());
        this.flightControl.addAirplane(id, capacity);
    }
    
    public void addFlight(){
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        Airplane airplane = flightControl.getAirplane(id);
        if(airplane == null){
            System.out.println("No airplane with the id " + id + ".");
        } else {
            System.out.println("Give the departure airport id: ");
            String dpid = scanner.nextLine();
            System.out.println("Give the target airport id: ");
            String tpid = scanner.nextLine();
            this.flightControl.addFlight(airplane, dpid, tpid);
        }
    }
    
    public void printAirplanes(){
        this.flightControl.printAirplanes();
    }
    
    public void printFlights(){
        this.flightControl.printFlights();
    }
    
    public void printAirplaneDetail(){
        System.out.println("Give the airplane id: ");
        String ID = scanner.nextLine();
        this.flightControl.printAirplaneDetail(ID);
    }
            
}
