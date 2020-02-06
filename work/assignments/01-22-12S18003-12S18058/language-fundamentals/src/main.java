/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 22-12s18003 Citra Hutajulu
 * @author 22-12s18058 Agnes Sinaga
 */
import java.util.ArrayList;

public class main {
    
    /* program emtry point */
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
        //declaring and manipulating primitive variables
    int gear = 1; 
    boolean result = true; 
    char capitalC = 'C'; 
    byte b = 100; 
 
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b); 
 
    gear++; 
    result = !result; 
    capitalC += 4; 
 
    System.out.println(gear + ", " + result + ", " + capitalC + ", " + b); 
 
    // 26 in hexadecimal and binary 
    int hexVal = 0x1a; 
    int binVal = 0b11010; 
 
    System.out.println(hexVal + ", " + binVal);
    
    // intantiating and manipulating objects 
    String name = "Wiro Sableng"; 
    Short gearObject = 1; 
    Boolean resultObj = true; 
    
    System.out.println(name + ", " + gearObject + ", " + resultObj); 
 
    name = name.toUpperCase(); 
    gearObject++; 
    resultObj = (result == false) || !resultObj; 
 
    System.out.println(name + ", " + gearObject + ", " + resultObj); 
    
     //Challenge modification
    System.out.println();
    System.out.println("Challenge");
    
    ArrayList<ArrayList<Integer>> challenge=new ArrayList<ArrayList<Integer>>();
    int numbers = 10;
    
    for(int i = 0; i < numbers; ++i) {
        challenge.add(new ArrayList<Integer>());
        for(int j = 0; j < numbers; ++j) {
            challenge.get(i).add(i+j);
        }
    }
    
    for(int i = 0; i < numbers; ++i) {
        for(int j = 0; j < numbers; ++j) {
            System.out.print(challenge.get(i).get(j) + " ");
        } 
        System.out.println();
    }
    
   }
}

