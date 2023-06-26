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
import java.util.Collections;


public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card>cardList;
    
    public Hand(){
        this.cardList = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cardList.add(card);
    }
    
    public void print(){
        this.cardList.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(cardList);
    }
    
    public void sortBySuit(){
        Collections.sort(this.cardList, new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand compared){
        int valueThis = this.cardList.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        int valueCompared = compared.cardList.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        return valueThis - valueCompared;
    }
    
}
