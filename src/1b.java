//1b

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
