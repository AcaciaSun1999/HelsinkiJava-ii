/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    
    @Override
    public int compare(Card card1, Card card2){
        int difference = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        if(difference == 0){
            return card1.compareTo(card2);
        }
        return difference;
    }
}
