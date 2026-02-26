import java.util.Scanner;
public class ConstructorOverload {
	String name;
	int age;
	ConstructorOverload(){
		name="Unknown";
		age=0;
	}
	ConstructorOverload(String n,int a){
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter age: ");
			int age=sc.nextInt();
			
			ConstructorOverload P1 = new ConstructorOverload();
			ConstructorOverload P2 = new ConstructorOverload("Abhinab Baruah",21);
			ConstructorOverload P3 = new ConstructorOverload(name,age);
			P1.display();
			P2.display();
			P3.display();
		}
	}

}
