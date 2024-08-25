/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e2;

/**
 *
 * @author w9640628
 */

/** This is adaptive design pattern which bridges two incompatible data classes */
public class AdaptedTSProduct extends ASCStockItem {
    //field
    private TSProduct skate;
    
    //constructor
    public AdaptedTSProduct(String num, String make, String mdl, String clr, String notes, double price, int stk) {
        
        // Instatiating Base class
        //pounds = int(price)
        //pence in decimals = (price - pounds), pence = (price-pounds)*100
        super(num, make + mdl , notes, (int)price, (int)((price - (int)price)*100) , stk);
        
        //Instantiating the filed.
        skate = new TSProduct (num, make, mdl, clr, notes, price, stk);
    
    } 
    
}
