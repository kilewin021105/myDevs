/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Acer
 */
public class PowerRanger {
    
    String name;
    int power,hp;

    public PowerRanger(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }public void status(){
            System.out.println("override me");
    }
    public void printInfo(){
        System.out.println("Ranger : " + name);
        System.out.println("Health : " + hp);
        System.out.println("Power  : " + power);
        
        
    }
    
    

  
    
  
}
