import java.util.Scanner;
public class PalindromeSTR {
    public static void main(String[] args) {
        System.out.println("enter the string you want to reverse");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine(); 
        String check = str;
        String rev = "";
        int len = str.length()-1;
        while(len >= 0){
            rev = rev + (str.charAt(len));
            len = len-1;
           

        }
        if( rev ==  check){
            System.out.println("The string is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome Str.");
        }
        sc.close();
    }
    
}
