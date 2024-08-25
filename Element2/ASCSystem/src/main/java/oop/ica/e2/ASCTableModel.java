/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e2;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author w9640628
 */

/** This is a abstract table model which loads items in arrayList into JTable */
public class ASCTableModel extends AbstractTableModel {
    
    // 1D Array columnNames and 2D array data
    private final String [] columnNames;
    private final Object[][] data;
    
    //constructor with parameters column names and arraylist that contains data
    public ASCTableModel(String[] colNames, ArrayList<ASCStockItem> stockItemsList) {
        int columnNamesLength = colNames.length;
        
        //copy of column names
        columnNames = Arrays.copyOf(colNames, columnNamesLength);
        
        //size of arraylist
        int rowLength = stockItemsList.size();
        
        //set size of data array
        data = new Object[rowLength][columnNamesLength];
        
        //set index variables for data row
        int row=0;
        
        //loop through ArrayList
        for (ASCStockItem item: stockItemsList){
            
            //get fields
            String productCode = item.getStockCode();
            String title = item.getTitle();
            String description = item.getDescription();
            Double price = item.getPrice();
            Integer quantity = item.getStock();
        
            //use fields to create object array
            Object [] dataRow = new Object[] {productCode, title, description, "£" + price, quantity};
            
            //copy row data array into current data
            data[row] = Arrays.copyOf(dataRow, columnNamesLength);
            
            //repeat same for next row
            row++;
        }
        
    }
    
    

    @Override
    public int getRowCount() {
       return data.length; 
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
}
