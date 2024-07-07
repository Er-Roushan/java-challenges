/* *Problem Statement:
 * Perform left rotation(also known as clockwise rotation) on an array.
 */
package Array;

import java.util.Scanner;

public class LeftRotationOfArr {

    // method to rotate the array
    public static void leftRotation(int[] arr, int rotation_times) {

        int temp;
        // left rotation operation
        for (int i = 1; i <= rotation_times; i++) {
            temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }

        // printing of array elment after rotation
        System.out.print("Array elements after " + rotation_times + " times left rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }// end of leftRotation method

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

        // Rotation times
        System.out.print("Enter how many times you want left rotation: ");
        int rotation = obj.nextInt();

        // method call to perform rotation
        if (rotation < 0) {
            System.out.println("Please enter positive rotation times.");
        } else if (rotation == 0) {
            System.out.println("Array elements after 0 times left rotation: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
        } else {
            leftRotation(arr, rotation);
        }

        obj.close();
    }// end of main
}//end of class 
