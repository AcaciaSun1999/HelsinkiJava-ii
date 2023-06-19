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

public class BoxWithMaxWeight extends Box{
    
     private int capacity;
     private ArrayList<Item>itemList;
     
     public BoxWithMaxWeight(int capacity){
         this.capacity = capacity;
         this.itemList = new ArrayList<>();
     }
     
     @Override
     public void add(Item item){
         int totalWeight = 0;
         for(Item aItem : itemList){
             totalWeight = totalWeight + aItem.getWeight();
         }
         if(totalWeight + item.getWeight() <= this.capacity){
             itemList.add(item);
         }
     }
     
     @Override
     public boolean isInBox(Item item){
         for(Item aItem : itemList){
             if(aItem.equals(item))
                 return true;
         }
         return false;
     }
}