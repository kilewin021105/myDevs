/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Acer
 */
public class Black extends PowerRanger{

    public Black(String name, int power, int hp) {
        super(name, power, hp);
    }
    
    public void status(){
        
        System.out.println("Dialog : I am " + name + " Ranger and i am a fighter");
    }
   
}
