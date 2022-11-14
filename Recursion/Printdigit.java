import java.util.Scanner;

public class Printdigit {
    static void print( int pow , int copy1){
        if(copy1==0){
            return;
        }
        System.out.println(copy1/pow);
        copy1=copy1%pow;
        pow=pow/10;
        print( pow, copy1);

    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int n = new Scanner(System.in).nextInt();
        int count=0;
        int copy1=n;
        while(n!=0){
            n=n/10;
            count=count+1;
        }
        int pow =1;
        while(count>1){
            pow=pow*10;
            count--;
        }
        System.out.println(pow);
        System.out.println(copy1);
        print( pow , copy1);
    

    }
     
}
