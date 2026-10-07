import java.util.Scanner;



public class DoubleSelection{
   public static void main(String [] args){
	   
	   Scanner entry = new Scanner(System.in);
	   
	   System.out.print("Enter fullname: ");
	   String fullName = entry.nextLine();
	   
	   System.out.print("Enter username: ");
	   String username = entry.next();
	   
	   
	   System.out.print("Enter password: ");
	   String password = entry.next();
	   
	   
  
	   
	   if(username.equals("johnnydep") && password.equals("12345")){
		   System.out.println("Access granted");
		    System.out.println(fullName + " You are welcome");
	   }
	   else{
		   System.out.println("ACCESS DENIED");
	   }
   }
}
