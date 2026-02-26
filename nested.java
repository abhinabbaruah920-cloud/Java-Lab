public class nested {
    int num=5;
    public class inner{
        void display(){
            System.out.println("The number is:"+num);
        }
    }
}

class Main{
    public static void main(String[] args){
    nested obj = new nested();
    nested.inner obj1 = obj.new inner();
    obj1.display();
}
}
