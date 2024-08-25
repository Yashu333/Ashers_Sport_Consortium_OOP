/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.e1;

/**
 *
 * @author 
 * W9640628 - YASWANTH SAI CHINTHAKAYALA
 * W9625845 - THIRUMALA SAI KRISHNA JAKKULA
 * W9623348 - HEMANTH KUMAR GOGULLA RAMBABU
 */
import java.util.Scanner;
public class SportsShopSystem {
    public static void main(String[] args){
        String option;
        Scanner input = new Scanner(System.in);
        
        System.out.println("ASHER SPORTS CONSORTIUM\n");
        do{ //repeat the steps until option is not equal to 0
            displayMenu();
            option = input.nextLine(); // Taking option as input from the user
            System.out.print("\n");
            // Chose switch case to display respective menu options
            
            switch (option){
                case "0":
                    System.out.println("***** Thank you for your visit *****");
                    break;
                case "1":
                    viewItems();
                    break;
                case "2":
                    buyItems();
                    break;
                case "3":
                    addStock();
                    break;
                default:
                    System.out.println("quit");
                    System.out.println("!!!!! Please select a menu option to continue !!!!!");
                    System.out.print("\n");
                    break;
            } // End of Switch case
        }while(!option.equals("0")); //End of do-while loop
                
    } //End of main method
    
    // Seperate methods for view items, buy items and adding stock.
    public static void viewItems(){
        System.out.println("VIEW ITEMS\n");
    }
    
    public static void buyItems(){
        System.out.println("BUY ITEMS\n");
    }
    
    public static void addStock(){
        System.out.println("ADD STOCK\n");
    }
    
    public static void displayMenu(){
        System.out.println ("MAIN MENU: Please select a menu option to continue");
        System.out.println("\t[1] View Items");
        System.out.println("\t[2] Buy Item");
        System.out.println("\t[3] Add stock");
        System.out.println("\t[0] Quit");
        System.out.print("\n");
        
    }
    
    
} //end of SportsShopSystem class
