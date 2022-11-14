package Programs;
import java.util.Scanner;
public class Firstdigit {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int n = new Scanner(System.in).nextInt();
        int count = 0;
        //int n=12345;
        int copy=n;
        //int pow=int()Math.pow(0, count-1);
        while(n!=0){
            n=n/10;
            count++;
        } 
        System.out.println(count);       
        int pow=1;
        while(count>1){
            pow=pow*10;
            count--;
        }
        while(copy!=0){
        System.out.println(copy/pow);
        copy=copy%pow;
        pow =pow/10;
    }
    }
}
