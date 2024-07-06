/*Problem Statement:
WAJP to find the average of elements present in an array.
*/
package Array;

import java.util.Scanner;

public class AvgOfArrEle {

    // method to find the average
    public static void averageOfEle(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average of elements present in the array is: " + (sum)/arr.length);
    }// end of averageOfEle() method

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = obj.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = obj.nextInt();
        }
        // method call to find the average of elements
        averageOfEle(arr);
        obj.close();
    }// end of main

}// end of class
