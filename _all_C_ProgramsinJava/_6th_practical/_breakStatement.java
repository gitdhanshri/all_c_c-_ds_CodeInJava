//break statement:
//Break statement is used to terminate the while loops, switch case loops and for
//loops from the subsequent execution.
//Syntax: break;
class BreakStatment{
	void break_statement(){
		int i=0;
		for(i=1;i<10;i++){
			if(i==5)
			{
				System.out.println("Coming out of for loop when i = 5");
				break;
			}
			System.out.println("\n"+i);
		}
	}
	public static void main(String args[]){
		BreakStatment   B1=new BreakStatment();	
		B1.break_statement();
	}
}
