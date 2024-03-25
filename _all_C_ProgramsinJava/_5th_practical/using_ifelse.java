//Practical 5: Study of Decision making statements and Write C programs using
//a. if statement
//b. if…else statement
//c. nested if else statement (else if ladder statements)

import java.util.Scanner;
class Ifkeyword{
	void useOfIf_else(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("\nEnter the Number");
    		double amount = myObj.nextDouble();
		if(amount>1000){
			System.out.println("Amount is greater than 1000");
		}
		else{
			System.out.println("Amount is not Greater than 1000");
		}
	 }
	public static void main(String args[]){
		Ifkeyword i1=new Ifkeyword();	
		i1.useOfIf_else();
		
	}
}
