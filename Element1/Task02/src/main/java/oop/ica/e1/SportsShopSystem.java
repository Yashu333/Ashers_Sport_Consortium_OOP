/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *@author 
 * w9640628 - Yaswanth sai chinthakayala
 * w9625845 - Thirumala saikrishna Jakkula
 * w9623348 - Gogulla rambabu Hemanth kumar
 * 
 */

public class SportsShopSystem {
    
    private static final ArrayList<ASC_Stock_Item> stockItemsList = new ArrayList<>();
    
    public static void main(String[] args){
        
        int option;
        loadData();
        System.out.println("\nASHER SPORTS CONSORTIUM\n");
        
        do{ //repeat the steps until option is not equal to 0
            displayOptions("mainMenu");
            option = takeValidInput("mainMenu");
            System.out.print("\n");
            
            switch (option){
                case 1:
                    viewItems();
                    break;
                case 2:
                    buyItems();
                    break;
                case 3:
                    addStock();
                    break;
                case 0:
                    System.out.println("***** Thank you for your visit *****");
                    break;
                default:
                    System.out.println("!!!!! Please select a menu option to continue !!!!!");
                    System.out.print("\n");
                    break;
            } // End of Switch case
            
        }while(option!=0); //End of do-while loop
                
    } //End of main method
    
    //This method is used to add items to the stock list.
    public static void loadData(){
        stockItemsList.add(new ASC_Stock_Item("RUN1234567","RunTech Shorts","High quality runnning shorts",10,0,10));
        stockItemsList.add(new ASC_Stock_Item("CYC1111111","Cycle4ever Cycling Jacket","Ultra lightweight jacket for the urban cyclist",50,0,20));
        stockItemsList.add(new ASC_Stock_Item("SWM2222222","7oceans Goggles","Super HiTech goggles for the extreme swimmer",24,99,8));
        }
    
    //This method makes sure the input is valid.
    public static int takeValidInput(String menu){
        
        Scanner input = new Scanner(System.in);
        int option;
            
        while(true){
                
            try{
                option = input.nextInt();
                if (option>=4 || option<0){
                    throw new Exception ();
                }
                break;
            }
                
            catch (Exception e){
                System.out.println("\nPlease select a valid option\n");
                displayOptions(menu);
                input.nextLine();
            }
                
        }
        return option;
    }
    
    //This method displays different menu's for different option selected.
    public static void displayOptions(String menu){
        
        if ("viewMenu".equals(menu)){
            System.out.printf("%-15s%-35s%-55s%-10s%-10s%-10s","Product Code","Title","Description","Pounds","Pence","Stock");

            for (ASC_Stock_Item Item: stockItemsList){
                System.out.printf("%n%-15s%-35s%-55s%-10s%-10s%-10s",Item.getStockCode(),Item.getTitle(),Item.getDescription(),Item.getPounds(),Item.getPence(),Item.getStock());
            }
            System.out.println("\n");
        }
        
        else if ("buyMenu".equals(menu) || "addMenu".equals(menu)){
            int count=1;
            
            System.out.printf("%-5s%-35s%-10s%-10s","ID","Title","Price","Stock");
            
            for (ASC_Stock_Item Item: stockItemsList){
                System.out.printf("%n%-5s%-35s%-10.2f%-10s",count,Item.getTitle(),Item.getPrice(),Item.getStock());
                count+=1;
            }
            System.out.println("\n");
            
        }
        
        else if ("mainMenu".equals(menu)){
            System.out.println ("MAIN MENU: Please select a menu option to continue");
            System.out.println("\t[1] View Items");
            System.out.println("\t[2] Buy Item");
            System.out.println("\t[3] Add stock");
            System.out.println("\t[0] Quit");
            System.out.print("\n");
        }
    }
    
   
    public static void viewItems(){
        
        System.out.println("VIEW ITEMS\n");
        displayOptions("viewMenu");
    }
    
    public static void buyItems(){
        
        System.out.println("BUY ITEMS\n");
        displayOptions("buyMenu");
        System.out.println("Select item to buy, or 0 to return to main menu\n");
        
        int option;
        option = takeValidInput("buyMenu");
        
        if (option == 0){
            return;
        }
        
        ASC_Stock_Item item = stockItemsList.get(option-1);
        
        //stops the decrementing counter when quantity reaches 0
        if (item.getStock()==0){
            System.out.println("\nItem out of stock\n");
            return;
        }
        
        item.setQuantity(item.getStock()-1);
        System.out.printf("\nSale of %s for %.2f confirmed. Qunatity remaining: %d%n%n",item.getTitle(),item.getPrice(),item.getStock());
    }
    
    /** This method add items to the stock*/
    public static void addStock(){
        
        System.out.println("ADD STOCK\n");
        displayOptions("addMenu");
        System.out.println("Select item if to add, or 0 to return to main menu");

        int option = takeValidInput("addMenu");
        
        if (option ==0){
            return;
        }
        
        ASC_Stock_Item item = stockItemsList.get(option-1);
                
        item.setQuantity(item.getStock()+1);
        System.out.printf("New quantity for %s is: %d%n\n",item.getTitle(),item.getStock());        
    
    } 
}
    
    
 
