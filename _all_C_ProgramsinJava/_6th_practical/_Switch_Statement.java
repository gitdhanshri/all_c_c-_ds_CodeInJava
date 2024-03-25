//Practical_6: Study of switch case statement in java  and example programs.
/*switch case statement
Switch case statements are a substitute for long if statements that compare a
variable to several "integral" values ("integral" values are simply values that can
be expressed as an integer, such as the value of a char). The basic format for
using switch case is outlined below. The value of the variable given into switch
is compared to the value following each of the cases, and when one value
matches the value of the v*/
/*Syntax:
		switch (expression)
		{
		case label1;
			statements;
			break;
		case label2;
			statements;
			break;
		default:
			statements;
			break;
}*/
import java.util.Scanner;
class SwitchStatment{
	void useOfSwitch(){
		Scanner sc=new  Scanner(System.in);
		System.out.print("Enter the Number -->:");
		int day=sc.nextInt();
		//System.out.println("Enetered Number is->:"+day);
	switch (day){
		  case 1:
		        System.out.println("It 's  Monday");
		   	 break;
		  case 2:
		 	 System.out.println("It 's Tuesday");
		    	 break;
		  case 3:
			 System.out.println("It 's Wednesday");
			 break;
		  case 4:
		    	System.out.println(" It 's Thursday");
		    	break;
		  case 5:
		    	System.out.println(" It 's Friday");
		    	break;
		  case 6:
		    	System.out.println(" It 's Saturday");
		    	break;
		  case 7:
		    	System.out.println(" It 's Sunday");
		    	break;
		  default:
		  	System.out.println("Entered Number ");
	  }
	}
	public static void main(String args[]){
		SwitchStatment s1=new SwitchStatment();
		s1.useOfSwitch();
	}
}
