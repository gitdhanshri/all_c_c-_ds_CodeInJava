import java.util.Scanner;

class WhileLoop{
	void whileloop(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Number -->");
		int number=sc.nextInt();
		while(number<50){
			System.out.println(number);
			number++;
		}
	
	}
	public static void main(String args[]){
		WhileLoop w1=new WhileLoop();
		w1.whileloop();
	}
}
