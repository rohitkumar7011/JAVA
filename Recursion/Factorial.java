import java.util.Scanner;

public class Factorial {
    static int fact(int n ){
        if(n==0){
            return 1;
        }
        return n*fact(n-1); 

    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fact(n));

    }
    
}
