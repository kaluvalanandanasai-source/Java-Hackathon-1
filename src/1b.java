//1b) If-Else Condition:

//Write a Java program to calculate the water bill based on water consumption. Read the water consumption in litres.

//If consumption is 500 litres or less, the bill is Rs.100.
//If consumption is more than 500 litres, the bill is Rs.200.
//Use an if-else statement and display the water bill.

import  java.util.Scanner;

class IfElse1b {
public static void main (String[] args) {
  
Scanner sc = new Scanner (System.in)
  
System.out.print("Enter Number Of Litres Consumed: ");
double litre = sc.nextDouble();
  
if (litre<=500.0) {
System.out.println("Your Bill Is Rs.100");
}
  
else {
System.out.println("Your Bill Is Rs.200");
}
}
}
