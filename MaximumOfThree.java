public class MaximumOfThree {
	int a,b,c;
	MaximumOfThree(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	void findmax() {
		int max;
		if(a>=b && a>=c) {
			max=a;
		}else if(b>=a && b>=c) {
			max=b;
		}else {
			max=c;
		}
		System.out.println("Max number: "+max);
	}
	
	
	
	public static void main(String[] args) {
		MaximumOfThree obj = new MaximumOfThree(2,5,7);
		obj.findmax();
	}

}
