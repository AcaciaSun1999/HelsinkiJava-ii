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

public class Pipe<T> {
    
    private List<T>list;
    
    public Pipe(){
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        list.add(value);
    }
    
    public T takeFromPipe(){
        T t = null;
        if(!list.isEmpty()){
            t = list.get(0);
            list.remove(t);
        }
        return t;
    }
    
    public boolean isInPipe(){
        if(list.isEmpty()){
            return false;
        }
        return true;
    }
    
}
