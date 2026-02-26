public class Fibonacci {
	int n;
	Fibonacci(int num){
		n=num;
	}
	void display() {
		int a=0,b=1,c;
		System.out.println("Fibonacci Series: ");
		for(int i=0;i<=n;i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			}
	}
	public static void main(String[] args) {
		Fibonacci obj = new Fibonacci(10);
		obj.display();
	}

}
