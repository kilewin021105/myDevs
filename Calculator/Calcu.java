/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculator;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Calcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Operator cl = new Operator();
        
        System.out.print("First Number   : ");
        cl.num1 = scan.nextInt();
        System.out.print("Enter Operator : ");
        scan.nextLine();
        cl.operator = scan.nextLine().charAt(0);
        System.out.print("Second Number  : ");
        cl.num2 = scan.nextInt();
        System.out.println("");
        switch(cl.operator){
            case '+':
               cl.println("Result  : " + cl.num1 + " + " + cl.num2 + " = " + cl.Addition());
                break;
            case '-':
                cl.println("Result : " + cl.num1 + " - " + cl.num2 + " = " + cl.Subtraction());
                break;
            case '*':
                
                cl.println("Result : " + cl.num1 + " * " + cl.num2 + " = " + cl.Multiply());
                break;
            case '/':
                
                cl.println("Result : " + cl.num1 + " / " + cl.num2 + " = " + cl.Devide());
                break;
            default:
                System.out.println("invalid operator");
                break;
                
        }
        
    }
    
}
