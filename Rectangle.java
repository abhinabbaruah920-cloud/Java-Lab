public class Rectangle {
	double length,breadth;
	void area() {
		double result=length*breadth;
		System.out.println("Area of Rectangle is: "+result);
	}
	void perimeter(){
		double result=2*(length+breadth);
		System.out.println("Perimeter of Rectangle is: "+result);

	}
	
	
	public static void main(String[] args) {
		Rectangle obj= new Rectangle();
		obj.length=35;
		obj.breadth=24;
		obj.area();
		obj.perimeter();
		
	}

}
