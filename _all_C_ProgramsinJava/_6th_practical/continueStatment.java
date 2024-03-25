//break statement:
//Break statement is used to terminate the while loops, switch case loops and for
//loops from the subsequent execution.
//Syntax: break;
class ContinueStatment{
	void break_statement(){
		int i=0;
		for(i=1;i<10;i++){
			if(i==5)
			{
			System.out.println("  i = 5");
				continue;
			}
			System.out.println("\n"+i);
		}
	}
	public static void main(String args[]){
		ContinueStatment   B1=new ContinueStatment();	
		B1.break_statement();
	}
}
