import java.util.Scanner;
public class SumofEVEandODD {

    static int sumevenandodd( int num, int count){
        if(count==0){
            
            return 0;
        }
        int odd = 0;
        int even = 0;
        sumevenandodd(num%10, count-1);
        if (count%2!=0){
            odd = odd + (num%10);
            System.out.println(odd);
        } else {
            even = even + (num%10);
            System.out.println(even);    
        } 
        return even;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = new Scanner(System.in).nextInt();
        int count=0;
         int copy=num;
        while(copy!=0){
            copy=copy/10;
            count= count+1;
        }
        sumevenandodd(num, count);
    }
    
}
