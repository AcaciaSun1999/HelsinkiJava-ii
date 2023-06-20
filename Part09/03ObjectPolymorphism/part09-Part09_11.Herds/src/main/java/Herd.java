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

public class Herd implements Movable{
    
    private ArrayList<Movable>members;
    
    public Herd(){
        this.members = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        members.add(movable);
    } 
    
    @Override
    public String toString(){
        String s = "";
        for(Movable item: members){
            s = s + item.toString() + "\n";
        }
        return s;
    }
    
    public void move(int dx, int dy){
        for(Movable item : members){
            item.move(dx, dy);
        }
    }
    
}
