public class overloading {
    int side= 5;
    int length;
    int breadth;
    int radius;

    void area(){
        int result =side*side;
        System.out.println("Area of square: "+result);
    }
        void area(int length,int breadth){
        int result =length*breadth;
        System.out.println("Area of square: "+result);
    }
        void area(int radius){
        double result =3.14*radius;
        System.out.println("Area of square: "+result);
    }

    public static void main(String[] args) {
        overloading obj = new overloading();
        obj.area();
        obj.area(2,3);
        obj.area(2);
    }
}
