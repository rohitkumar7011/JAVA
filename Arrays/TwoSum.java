package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENter the number you want sum of :");
        int k = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == k) {
                    System.out.println(i);
                    System.out.println(j);
                }

            }
        }
        sc.close();
    }
}
