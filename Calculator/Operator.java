/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author Acer
 */
public class Operator {
    int num1;
    int num2;
    char operator;
   
    
    //char operator = s.nextLine().charAt(0);
 
     int Addition(){
        return num1 + num2;
         
    }
     int Subtraction(){
         return num1 - num2;
     }
     int Multiply(){
         return num1 * num2;
     }
     int Devide(){
         return num1 / num2;
     }
    void println(String word){
        System.out.println(word);
    }
    
}
