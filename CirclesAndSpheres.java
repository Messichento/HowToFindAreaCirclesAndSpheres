/**
 * Author: Mussie Okbe
 * Date: March 21, 2021
 * Description: The objective of this project is to write a program using a 
 *              variable and mathematical operations. 
 */
package circlesandsphers;

/**
 *
 * @author mussie
 */
public class CirclesAndSpheres {
    
    public static void main(String[] args){
        
        //declaring a constant radius
        final double pi = 3.14159;
        
        //declaring variable to store data
        double radius = 4.2;
        double diameter;
        double circumference;
        double area;
        double surfaceArea;
        double volume;
        
        //printing out the current value of radius
        System.out.println("For a circle of radius 4.2 inches: ");
        
        //Calculating the diameter 
        diameter = radius * 2;
        System.out.println("\tThe diameter is " + diameter + " inches.");
        
        //Calculating the circumference
        circumference = 2*pi*radius;
        //OR
//        circumference = pi * diameter;
        
        System.out.println("\tThe circumference is " + circumference + " inches.");
        
        //Calculating the are
        area = pi*radius *radius;
        System.out.println("\tThe are is " + area + " square inches");
        
        //printing out the curent radius for a sphere 
        System.out.println("For a sphere with the radius:");
        
        //Calculating the surface are
        surfaceArea = 4 * pi * radius * radius;
        System.out.println("\tThe surface area is " + surfaceArea + " square inches.");
        
        //calculating the volume
        volume = 4.0/3.0* pi * radius * radius * radius;
        System.out.println("\tAnd the volume is " + volume + " cubec inches");
                
    } //end of main 
} //end of the class
