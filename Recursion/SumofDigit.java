import java.util.Scanner;

public class SumofDigit {
   static void Sum(int n , int sum){
    if(n==0){
        System.out.println(sum);
        return;
    }
    int m = n%10;
    sum=sum+m;
    n=n/10;
    Sum(n ,sum);

    }
    public static void main(String[] args) {
        System.err.println("enter the number");
        int n = new Scanner(System.in).nextInt();
        int sum=0;
        Sum(n , sum);
    }
    
}
