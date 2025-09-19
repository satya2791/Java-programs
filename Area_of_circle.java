// Import Scanner class from java.util package to take user output
import java.util.Scanner;
public class Area_Of_Circle {
  public static void main(String[] args) {
    // Create scanner object to read input from the keyboard 
    Scanner sc = new Scanner(System.in);
    // Ask the user to enter the radius
    System.out.println("Enter the radius of circle: ");
    // Read the radius as a double value
    double r = sc.nextDouble();
    // Define value of pi
    double pi = 3.1415;
    // Calculate the area using formula: pi*r*r
    double AreaOfCircle = pi * r * r;
    // Print the result to the user
    System.out.println("The Area Of Circle is: " + AreaOfCircle);
    // Close the Scanner to prevent the memory leak
    sc.close();
  }
}