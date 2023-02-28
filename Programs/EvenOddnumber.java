package Programs;
import java.util.Scanner;

public class EvenOddnumber {
    public static void main(String[] args) {
        System.out.println("enter the range");
        int n = new Scanner(System.in).nextInt();
        int evencount=0;
        int oddcount=0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                evencount++;
            }
            else{
                oddcount++;
            
            }
        }
        sc.close();
        System.out.println(evencount);
        System.out.println(oddcount);
    }
    
}
