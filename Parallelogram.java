
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class Parallelogram {
    
    Scanner input = new Scanner(System.in);
    
    private float length, width;
    
    
    public void setLength()
    {
        System.out.println("Please enter the length of your parallelogram: ");
        length = input.nextFloat();
    }
    
    public void getLength()
    {
        System.out.println("The length of your parallelogram is: " + length + ".");
    }
    
    public void setWidth()
    {
        System.out.println("Please enter the width of your parallelogram: ");
        width = input.nextFloat();
    }
    
    
    public void getWidth()
    {
        System.out.println("The width of your parallelogram is: " + width + ".");
    }
    
    
    public void getArea()
    {
        if (length > 0 && width > 0)
            System.err.println("The area of your parallelogram is " + length*width + ".");
        
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    
    }
    
    
    public String toString()
    {
        System.out.println("Private:Length,Width,Public:Setters, Area");
        return ("Private:Length,Width,Public:Setters, Area");
    }
    
    
    
    public static void main(String[] args) {
           
               
        Parallelogram parallelo = new Parallelogram();
        
        parallelo.setLength();
        
        parallelo.setWidth();
        
        parallelo.getArea();
        
        parallelo.toString();
    }
}
