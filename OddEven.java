public class OddEven {
	int num;
	void check() {
		if(num%2==0) {
			System.out.println("The number "+num+ " is Even");
		}else {
			System.out.println("The number "+num+ " is Odd");

		}
	}
	public static void main(String[] args) {
		OddEven obj1 = new OddEven();
		OddEven obj2 = new OddEven();

		obj1.num=23;
		obj1.check();
		obj2.num=22;
		obj2.check();
	}

}
