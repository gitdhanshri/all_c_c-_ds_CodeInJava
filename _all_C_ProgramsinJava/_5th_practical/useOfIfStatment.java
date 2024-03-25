//Practical 5: Study of Decision making statements and Write C programs using
//a. if statement
import java.util.Scanner;
class Ifkeyword{
	void useOfIf(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("\nEnter the Number");
    		double amount = myObj.nextDouble();
		if(amount>1000){
			System.out.println("Amount is greater than 1000");
		}
	 }
	public static void main(String args[]){
		Ifkeyword i1=new Ifkeyword();	
		i1.useOfIf();
		
	}
}
