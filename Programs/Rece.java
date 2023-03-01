import java.util.Scanner;

public class Rece {
    public static void main(String[] args) {
        System.out.println("enter the string you want to reverse");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine(); 
        String rev = "";
        int len = str.length()-1;
        while(len >= 0){
            rev = rev + (str.charAt(len));
            len = len-1;
            //System.out.println(rev);

        }
        System.out.println(rev);
        sc.close();
    }
}

