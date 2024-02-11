/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volume;

import javax.swing.JOptionPane;

/**
 *
 * @author rosy
 */
public class Volume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name;
        int grade=10;
        double diameter;
        double v1;
        double v2;
        double height;
        double radius;
        double totalVolume;
        
        
        name=JOptionPane.showInputDialog("What is your name");
        diameter=Double.parseDouble(JOptionPane.showInputDialog("Enter the diameter of the hemisphere"));
        height=Double.parseDouble(JOptionPane.showInputDialog("Enter the height of the cylinder"));
        
        radius=diameter/2;
        v1=(2/3) * Math.PI * radius * radius;
        v2= Math.PI * radius * radius * height;
        totalVolume= v1 + v2;
        totalVolume = totalVolume * 100;
        totalVolume= Math.round(totalVolume);
        totalVolume=totalVolume/100;
        
        
        System.out.println("This program was done by " + name + "in grade " + grade
                + "\nThe total volume of the given structure is " + totalVolume + " cubic meters");
        
        
        
        
        
        
    }
    
}
