public class ReverseNumber {
	int num;
	ReverseNumber(int a){
		num=a;
	}
	
	void reverse() {
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int digit = temp%10;
			rev= rev*10 + digit;
			temp=temp/10;
		}
		System.out.println("Original number: "+num);
		System.out.println("Reversed number: "+rev);

	}
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber(2564);
		obj.reverse();
	}

}
