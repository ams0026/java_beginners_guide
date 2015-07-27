/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1st9_weightconversion;

/**
 *
 * @author Richard
 */
public class Ch1ST9_weightconversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double var1, var2; //input weight, output weight
        int i; // counter
        double Moon = .17; // constant for the moon's percentage of earth
        var1 = 100;
            System.out.println("If you weighed this on Earth \t You'd weigh this on the Moon");
        for (i=100; i < 300; i=i+10){            
            System.out.println("\t\t" + i + "\t\t\t" + i*Moon);
            }
        
    


    }
    
}
