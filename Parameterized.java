public class Parameterized {
    int roll;
    String name;

    Parameterized (int r, String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+roll);
    }

    public static void main(String[] args) {
        Parameterized obj = new Parameterized(22,"Abhinab Baruah");
        obj.display();
    }
}


