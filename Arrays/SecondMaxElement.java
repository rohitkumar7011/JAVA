package Arrays;

import java.rmi.server.ServerNotActiveException;
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
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];

            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No Second largest element found");
        } else {
            System.out.println("element is: " + second);
        }
    }
}
