package Arrays;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int second = 0;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 1; j <= arr.length - 1; j++) {
            if (arr[j] < max) {
                second = arr[j];
            }
        }

        System.out.println("Second Max ELement is:" + second);
    }
}
