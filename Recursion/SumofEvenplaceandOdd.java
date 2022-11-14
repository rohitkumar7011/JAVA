/*
 * 
 * this is by looping......
 */


import java.util.Scanner;
public class SumofEvenplaceandOdd {
    /*static int sumofevenandodd(int pow, int num, int check){
        if(check%2!=0){
            oddsum=
        }*/
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int num = new Scanner(System.in).nextInt();
        int count=0;
         int copy=num;
        while(copy!=0){
            copy=copy/10;
            count= count+1;
        }
          int odd=0;
         int even = 0;
        while(count!=0){
            if (count%2!=0){
                odd = odd + (num%10);
                num = num/10;
            
            }
            else{
                even = even + (num%10);
                num = num/10;
            }
            count=count-1;
        }   
    System.out.println(even);
    System.out.println(odd);
    }
}
