import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        int n = new Scanner(System.in).nextInt();
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        System.out.println(rev);

    }
}
