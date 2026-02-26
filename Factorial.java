public class Factorial{
    int num;
    Factorial(int n){
        num=n;
    }

    void fact(){
        int f=1;
        for(int i=2;i<=num;i++){
            f*=i;
        }
        System.out.println("Factorial of the number "+num+" is: "+f);
    }
public static void main(String[] args) {
    Factorial obj = new Factorial(10);
    obj.fact();
}

}