import java.util.Scanner;

public class Lcmof2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;
        if (a > b)
            max = a;
        else
            max = b;
        while (true) {
            if (max % a == 0 && max % b == 0)
                break;
            max++;
        }
        System.out.println(max);
        sc.close();
    }
}
