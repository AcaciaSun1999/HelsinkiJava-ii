/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        super.addToWarehouse(initialBalance);
        this.history = new ChangeHistory();
        history.add(initialBalance);
    }
    
    public String history(){
        return this.history.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        double addToHistory = super.getBalance();
        history.add(addToHistory);
    }
    
    public double takeFromWarehouse(double amount){
        double addToHistory = super.getBalance();
        if(addToHistory >= amount){
            addToHistory = addToHistory - amount;
        }
        history.add(addToHistory);
        super.takeFromWarehouse(amount);
        return addToHistory;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
