public class PositiveNegative {
	int num;
	PositiveNegative(int a){
		num=a;
	}
	void check() {
		if(num==0) {
			System.out.println("The number is zero!!");
		}else if(num>0) {
			System.out.println("The number is positive!!");
		}else {
			System.out.println("The number is negative!!");
		}
	}
	public static void main(String[] args) {
		PositiveNegative obj1 =new PositiveNegative(26);
		PositiveNegative obj2 =new PositiveNegative(-26);
		obj1.check();
		obj2.check();
	}

}
