/*
 * Program to implement Binary Search
 */
package Array;

import java.util.Scanner;

public class BinarySearch {

    //method to perform the bubble sort
    public static void sorting(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            //if flag == 0 means array is sorted no need to go for more iteration
            if (flag == 0) {
                return;
            }
        }
    }

    //Method for binary search
    public static boolean bnrySearch(int[] arr, int val) {

        int start = 0, mid, end = arr.length - 1;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == val) {

                return true;
            } else if (val < arr[mid]) {
                end = mid - 1;

            } else {

                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = obj.nextInt();

        // array creation
        int[] arr = new int[size];

        // array initialization
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = obj.nextInt();
        }

        // get value to be search
        System.out.print("Please enter the value to be searched: ");
        int val = obj.nextInt();

        //Method to perform sorting in the array before binary search
        sorting(arr);

        //statements to perform binary search
        if (bnrySearch(arr, val))
            System.out.println("Yes the " + val + " is present in the array.");
        else
            System.out.println("Yes the " + val + " is present in the array.");

        obj.close();
    }
}
