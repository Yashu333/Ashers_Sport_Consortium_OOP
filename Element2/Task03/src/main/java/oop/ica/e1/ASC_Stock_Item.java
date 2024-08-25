/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e1;

/**
 *
 * @author 
 * w9640628 - Yaswanth sai chinthakayala
 * w9625845 - Thirumala saikrishna Jakkula
 * w9623348 - Gogulla rambabu Hemanth kumar
 */

public class ASC_Stock_Item {
    
    //fields
    private final String productCode;
    private final String title;
    private final String description;
    private final int pounds;
    private final int pence;
    private int stock;
        
    //constructor
    public ASC_Stock_Item(String productCode, String title, String description, int pounds, int pence, int stock){
        this.productCode = productCode;
        this.title = title;
        this.description = description;
        this.pounds = pounds;
        this.pence = pence;
        this.stock = stock;
    }
        
    
    //Accessors
    public String getTitle(){
        return title;
    }
    
    public String getStockCode(){
        return productCode;
    }
    
    public String getDescription(){
        return description;
    }
    
    public int getStock(){
        return stock;
    }
    
    public int getPounds(){
        return pounds;
    }
    
    public int getPence(){
        return pence;
    }
    
    public double getPrice(){
        return (pounds+(pence/100.0));
    }
    
    ///Mutators
    public void setQuantity(int stock){
        this.stock = stock;
    }
}
