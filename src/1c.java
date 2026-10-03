//1c) Methods:
import java.util.Scanner;

class Method1c {
static int calculateTotal(int morningUsage, int eveningUsage) {
  
return morningUsage + eveningUsage;
}
  
public static void main(String[] args) {
  
Scanner sc = new Scanner (System.in);
  
System.out.print("Enter Morning Water Usage: ");
int morningUsage = sc.nextInt();
  
System.out.print("Enter Evening Water Usage: ");
int eveningUsage = sc.nextInt();
  
int total = calculateTotal(morningUsage,eveningUsage);
System.out.println("Total water consumption: " + total + " litres");
}
}

