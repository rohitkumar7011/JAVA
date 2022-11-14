import java.util.Scanner;
public class ReverseSTR {
     static void reverse(int len, String str){
        if(len==-1){          
            return;
        }
        String rev ="";
        rev = rev + (str.charAt(len));
        System.out.println(rev);
        reverse(len-1, str);
        
    }
    public static void main(String[] args) {
        System.out.println("enter the string you want to reverse");
        Scanner s = new Scanner(System.in);
        String str= s.nextLine(); 
        int len = str.length()-1;
        reverse(len, str);    
    }
}