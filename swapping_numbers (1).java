// Program swapping two numbers using third variable
public class swapping_two_numbers {
  public static void main(String[] args) {
    // Declare and intializing two numbers
    int a = 10;
    int b = 20;
    // Printing original values before swapping 
    System.out.println("The value of 'a' before swapping is: " + a);
    System.out.println("The value of 'b' before swapping is: " + b);
    // Using third variable for swapping numbers
    // Store value of 'a' in 'c'
    int c = a;
    // asign value of 'b' to 'a'
    a = b;
    // assign value of 'c' to 'b'
    b = c;
    // Printing the values after swapping 
    System.out.println("The value of 'a' after swapping is: " + a);
    System.out.println("The value of 'b' after swapping is: " + b);
  }
}