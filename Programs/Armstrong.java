package Programs;
import java.util.Scanner;

public class Armstrong {
    
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int n = new Scanner(System.in).nextInt();
        int copy=n;
        int sum=0;
        while(n!=0){
            int r= n%10;
            sum= sum+(r*r*r);
            n=n/10;

        }
        if(copy==sum){
            System.out.println("armstrong number:");
        }
        else{
            System.out.println("not a armstrong number");
        }
        sc.close();
    }
}
