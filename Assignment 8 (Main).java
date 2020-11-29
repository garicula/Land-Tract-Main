// Garrick Morley
// ISYS 216 001, Fall 2019
// Dr. Kinuthia
// Assignment Eight Source (Main Class)

package morleygassignment8;

import java.util.*;

public class morleyGAssignment8{
  public static void main(String[] args) {
    
    //Declare all variables
    double length = 0;
    double width = 0;
    double area1 = 0;
    double length2 = 0;
    double width2 = 0;
    double area2 = 0;
    
    //Create scanner for user input
    Scanner keyboard = new Scanner(System.in);
    
    //Get user inputted numbers for length and width of tract #1
    System.out.println("Enter length of first land tract: ");
    length = keyboard.nextDouble();
    
    System.out.println("Enter width of first land tract: ");
    width = keyboard.nextDouble();
    
    //Create land tract object #1
    LandTract land1 = new LandTract(length, width);
    
    //Calculate the area of land tract #1
    area1 = LandTract.findArea(length, width);
    
    //Use mutator method to set the area to land tract #1
    land1.setArea(area1);
    
    
    //Get user inputted numbers for length and width of tract #2    
    System.out.println("\nEnter length of second land tract: ");
    length2 = keyboard.nextDouble();
    
    System.out.println("Enter width of second land tract: ");
    width2 = keyboard.nextDouble();    
    
    //Create land tract object #2
    LandTract land2 = new LandTract(length2, width2);
        
    //Calculate the area of land tract #2
    area2 = LandTract.findArea(length2, width2);
    
    //Use mutator method to set the area to land tract #2
    land2.setArea(area2);
    
    System.out.println("\nFirst land track: " + land1.toString());
    System.out.println("\nSecond land track: " + land2.toString());
    
    //Test to see if the two areas are equal or different
    if (land1.equals(land2))
          System.out.println("\nThe two tracts have the same size.");
        else
          System.out.println("\nThe two tracts do not have the same size.");         
  }
}