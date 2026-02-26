public class SwapNumbers {
	int num1;
	int num2;
	SwapNumbers(int a,int b){
		num1=a;
		num2=b;
	}
	void swap() {
		System.out.println("Before Swapping:\nFirst number: "+num1+" and Second Number: "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping:\nFirst number: "+num1+" and Second Number: "+num2);
	}
	public static void main(String[] args) {
		SwapNumbers obj = new SwapNumbers(20,30);

		obj.swap();
	}

}
