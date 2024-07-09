package Array;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = obj.nextInt();

        //Array creation
        int[] arr = new int[size];

        int sum = 0;
        for(int i=0; i<arr.length; i++){
             sum +=arr[i];
        }

        System.out.println("Sum of elements is: " + sum);
        obj.close();
    }
}
