//1a

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

