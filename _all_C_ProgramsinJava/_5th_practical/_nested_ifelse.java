//Practical 5: Study of Decision making statements and Write C programs using
//a. nested if else statement (else if ladder statements)

import java.util.Scanner;
class Ifkeyword{
	void useOf_Nestedifelse(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("\nEnter the Number 1:");
    		double number1 = myObj.nextDouble();
    		System.out.println("\nEnter the Number 2:");
    		double number2 = myObj.nextDouble();
		if(number1>number2)
		{
			System.out.println("Number  1 is greater than number 2");
		}
		else
		{
			if(number1<number2)
			{
				System.out.println("number1 is Smaller than number2");
			}
			else
			{
				System.out.println("Number1 and Number2 both are equal");
			}
		}
	}
	public static void main(String args[]){
		Ifkeyword i1=new Ifkeyword();	
		i1.useOf_Nestedifelse();
		
	}
}
