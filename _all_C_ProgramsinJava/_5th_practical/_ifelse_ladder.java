//Practical 5: Study of Decision making statements and Write C programs using
//a. if-else ladder
import java.util.Scanner;
class Ifkeyword{
	void useOfIf(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("\nEnter the Number");
    		double number = myObj.nextDouble();
		// Check if i is between 0 and 10
		if (number >= 0 && number<= 10)
			System.out.println("Number is between 0 and 10");
		else if (number >= 11 &&number <= 15)
			System.out.println("Number is between 11 and 15");
		// Since i is not between 11 and 15
		// Check if i is between 16 and 20
		else if (number >= 16 && number <= 20)
			System.out.println("Number is between 16 and 20");
		// Since i is not between 0 and 20
		// It means i is greater than 20
		else
			System.out.println("Number is greater than 20");
	 }
	public static void main(String args[]){
		Ifkeyword i1=new Ifkeyword();	
		i1.useOfIf();
		
	}
}
