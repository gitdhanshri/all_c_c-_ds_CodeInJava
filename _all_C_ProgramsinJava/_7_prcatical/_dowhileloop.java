import java.util.Scanner;
//Example program (do while loop):
class DoWhileLoop{
	void doWhileLoop(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number  :");
		int number=sc.nextInt();
		//System.out.println("Condition is not checked for first time \n");
		do
		{
		System.out.println("Now, Condition is true and value is :->"+number);
			number++;
		}while(number<10);
	}
	public static void main(String args[]){
		DoWhileLoop D1=new DoWhileLoop();
		D1.doWhileLoop();
	
	}
}
