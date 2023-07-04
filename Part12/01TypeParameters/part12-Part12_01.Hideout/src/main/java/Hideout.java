/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.List;
import java.util.ArrayList;

public class Hideout<T> {
    
    private List<T> list;
    
    public Hideout(){
        this.list = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if(!list.isEmpty()){
            list.clear();
        }
        list.add(toHide);
        
    }
    
    public T takeFromHideout(){
        T t = null;
        if(!list.isEmpty()){
            t = list.get(0);
            list.clear();;
        }
        return t;
    }
    
    public boolean isInHideout(){
        if(list.isEmpty()){
            return false;
        }
        return true;
    }
    
    
    
}
