//Question 1: Household Water-Usage & Billing Monitor
//1a) Data Types:

//Write a Java program to store and display the following details of a household:

//Number of family members – integer
//Water consumed in litres – decimal value
//House number – integer
//Water usage status – character
//Use appropriate Java data types for each value and display all the details.


import java.util.Scanner;

class DataTypes1a {
public static void main (String[] args) {
  
Scanner sc = new Scanner(System.in);'

System.out.print("Enter no of Family Members: ");
int mem = sc.nextInt();
  
System.out.print("Enter Consumed liters: ");
double litre = sc.nextDouble();
  
System.out.print("Enter House Number: ");
int house = sc.nextInt();
  
System.out.print("Enter Usage Status: ");
char status = sc.next().charAt(0);
  
System.out.println("Family Members: "+mem);
System.out.println("Litres Consumed: "+litre);
System.out.println("House Number: "+house);
System.out.println("Usage Status: "+status);
}
}

