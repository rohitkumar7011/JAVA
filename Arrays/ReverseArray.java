package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = arr.length;
        int i = 0;
        int j = s - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // FOR PRITING THE ARRYA...
        for (int m = 0; m < arr.length; m++) {
            System.out.println(arr[m] + " ")
            
            ;
        }

    }
}
