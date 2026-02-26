public class DivByFive {
	int num;
	DivByFive(int n){
		num=n;
	}
	void check() {
		if(num%5==0) {
			System.out.println(num+" is Divisible by Five.");
		}else {
			System.out.println(num+" is Divisible by Five.");
		}
	}
	public static void main(String[] args) {
		DivByFive obj = new DivByFive(255);
		obj.check();
	}

}
