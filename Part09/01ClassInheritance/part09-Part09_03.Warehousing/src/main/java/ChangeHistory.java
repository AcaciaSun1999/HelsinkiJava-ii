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
public class ChangeHistory {
    
    private ArrayList<Double>history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    public double maxValue(){
        if(!history.isEmpty()){
            double max = history.get(0);
            for(double number : history){
                if(number >= max){
                    max = number;
                }
            }
            return max;
        }
        return 0;
    }
    
    public double minValue(){
        if(!history.isEmpty()){
            double min = history.get(0);
            for(double number : history){
                if(number <= min){
                    min = number;
                }
            }
            return min;
        }
        return 0;
    }
    
    public double average(){
        if(!history.isEmpty()){
            double sum = 0;
            for(double number : history){
                sum = sum + number;
            }
            double average = sum / history.size();
            return average;
        }
        return 0;
    }
    
    public String toString(){
        return history.toString();
    }
}
