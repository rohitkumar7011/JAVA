import java.util.Scanner;

public class PowerofaNumber {
    static  int power(int m , int n){
        if(n==0){
            return 1;
        }
        else{
            return m*power(m,n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Enter raise to power");
        int n = new Scanner(System.in).nextInt();
        System.out.println(power(m, n));
    }
}

