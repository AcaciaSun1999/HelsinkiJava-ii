/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item>shoppingCart;
    
    public ShoppingCart(){
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(shoppingCart.containsKey(product)){
            shoppingCart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product,1,price);
            shoppingCart.put(product, item);
        }
        
    }
    
    public int price(){
        int sum = 0;
        for(Item item : shoppingCart.values()){
            sum = sum + item.price();
        }
        return sum;
    }
    
    public void print(){
        for(Item item : shoppingCart.values()){
            System.out.println(item);
        }
    }
}
