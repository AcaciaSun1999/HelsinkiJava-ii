/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.ArrayList;

public class Box implements Packable{
    
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(this.weight() + item.weight() <= this.capacity){
            box.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        for(Packable item : box){
            weight = weight + item.weight();
        }
        return weight;
    }
    
    public String toString() {
        return "Box: " + this.box.size() + " items, total weight " + 
                weight() + " kg";
    }
}
