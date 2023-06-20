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
import java.util.Set;
public class Warehouse {
    
    private Map<String, Integer>stockBalance;
    private Map<String, Integer>priceMap;
    
    
    public Warehouse(){
        this.stockBalance = new HashMap<>();
        this.priceMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        stockBalance.put(product,stock);
        priceMap.put(product,price);
    }
    
    public int price(String product){
        return priceMap.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return stockBalance.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(!this.stockBalance.containsKey(product)){
            return false;
        }
        if(this.stock(product) >= 1){
            this.stockBalance.put(product, stockBalance.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.stockBalance.keySet();
    }
    
    
}
