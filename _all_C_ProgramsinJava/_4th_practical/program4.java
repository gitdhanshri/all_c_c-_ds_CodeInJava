//Taking an input and ,printing an  output in java 
import java.util.Scanner;  // Import the Scanner class
class inputOutput{
 	 public static void main(String[] args) {
		  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		  System.out.println("Enter username");
		  String userName = myObj.nextLine();  // Read user input
		 
		 
		  System.out.println("Enter collge fees in double-->");
		  double clgFees=myObj.nextDouble();
		  
		  System.out.println("Enter Mobile Numbe in long -->");
		  long mobNum=myObj.nextLong();
		   
		  System.out.println("Enter Resistration Number in int-->");
		  int resNum=myObj.nextInt();
		  
		  System.out.println("String:Username is: " + userName);
		  System.out.println("Long:Mobile Number-->"+mobNum);
		  System.out.println("Double:ClgFees is: " +clgFees ); 
		  System.out.println("Int:Resistration Number is: " +resNum ); 
		  // Output user input
  }
}

