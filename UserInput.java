import java.util.Scanner;


public class UserInput{
     public static void main(String[] args){
	   Scanner Scan = new Scanner(System.in);
	   System.out.print("Enter your name: ");
	   String name = Scan.nextLine();
	   
	   System.out.print("Enter your gender: ");
	   String gender = Scan.next();
	   Scan.nextLine();
	   
	   System.out.print("Enter your address: ");
	   String address = Scan.nextLine();
	   
	   System.out.print("Enter your age: ");
	   int age = Scan.nextInt();
	   
	   System.out.print(name + " are you learning Java?(true/false): ");
	   boolean answer = Scan.nextBoolean();
	   
	   System.out.printf("Welcome %s to NIIT%n ",name);
	   System.out.printf("You are a %s and you are living in %s ",gender,address);
	   System.out.printf("You are %d years old. Nice meeting you%n",age);
	   System.out.printf("Wow you said true %b,. It means you are a prpfessional Java Programmer ",answer);
	   
	   
	 }
}