import java.util.Scanner;

public class INTREVse{
    public static void reverse(int n, int rev){
        if(n==0){
            System.out.println(rev);
            return;
        }
        rev = rev*10 + (n%10);
        n=n/10;
        reverse(n, rev);

    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        int n = new Scanner(System.in).nextInt();
         int rev = 0;
        reverse( n , rev);
    }
    
}












// isme stack upar jaate waqt result hm print karva rhe hain mtlb k stack bante time na k girte waqt.....
