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

public class MisplacingBox extends Box{
    
    private ArrayList<Item>itemList;
    
    public MisplacingBox(){
        this.itemList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        itemList.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        return false;
    }
}
