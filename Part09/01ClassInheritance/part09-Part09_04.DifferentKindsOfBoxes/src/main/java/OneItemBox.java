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
public class OneItemBox extends Box{
    
    private ArrayList<Item>itemList;
    
    public OneItemBox(){
        this.itemList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if(itemList.isEmpty()){
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
