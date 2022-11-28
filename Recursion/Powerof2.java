import java.util.Scanner;

public class Powerof2 {
    static int power(int n){
        if(n == 0){
            return 1;
        }
        return(2*power(n-1));
    }
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int  n = new Scanner(System.in).nextInt();
         int ans = power(n);
        System.out.println(ans);
        
    }
}
