/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public enum Education {
    PHD("Doctoral degree"),
    MA("Masters degree"),
    BA("Bachelors degree"),
    HS("High School diploma");
    
    private String degree;
    
    private Education(String degree){
        this.degree = degree;
    }
    
    public String getDegree(){
        return this.degree;
    }

    
    
}
