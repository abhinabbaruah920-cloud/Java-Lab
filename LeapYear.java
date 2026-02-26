public class LeapYear {
	int year;
	LeapYear(int a){
		year=a;
	}
	
	void check() {
		if(year%4==0 && year%100!=0) {
			System.out.println("The year "+year+" is a Leap Year.");
		}else if(year%400==0){
			System.out.println("The year "+year+" is a Leap Year.");
		}else{
			System.out.println("The year "+year+" is not a Leap Year.");
		}
	}
	public static void main(String[] args) {
		LeapYear obj1 = new LeapYear(1996);
		obj1.check();
		LeapYear obj2 = new LeapYear(2000);
		obj2.check();
	}

}
