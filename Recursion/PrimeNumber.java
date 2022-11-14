import java.util.Scanner;

public class PrimeNumber{
    static void prime(int org, int small){
        if(small==1){
            System.out.println("prime number");
            return;
        }
        if(org%small==0){
            System.out.println("not a prime number");
            return;
        }
        prime(org, small-1);


    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int org = new Scanner(System.in).nextInt();
        int small = org-1;
        prime(org, small);
        
    }
    
}
