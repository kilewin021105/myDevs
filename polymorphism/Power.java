/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
       PowerRanger blac = new Black("Black",1000,400);
       PowerRanger red = new Red("Red",2000,500);
       PowerRanger blu = new Blue("Blue",3000,700);
       
       blac.printInfo();
       blac.status();
        System.out.println("");
       blu.printInfo();
       blu.status();
        System.out.println("");
       red.printInfo();
       red.status();
        
    }
    
}
