class ArithmeticOperator{
	long add(int a,int b){
		return a+b;
	}
	long sub(int a,int b){
		return a-b;
	}
	long mul(int a,int b){
		return a*b;
	}
	long div(int a,int b){
		if(b==0){
			System.out.println("Can't Divide by 0");
			return -1;
		}
		else{
			return a/b;
		}
	}
	public static void main(String args[]){
		ArithmeticOperator a1=new ArithmeticOperator();
		System.out.println(a1.add(5,10));
		System.out.println(a1.sub(5,10));
		System.out.println(a1.mul(5,10));
		System.out.println(a1.div(5,10));
	}
}
