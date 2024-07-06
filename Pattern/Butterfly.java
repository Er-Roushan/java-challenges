package Pattern;
import java.util.Scanner;
public class Butterfly{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i=1; i<num*2; i++){
           
            System.out.println();
        }
        input.close();
    }
}