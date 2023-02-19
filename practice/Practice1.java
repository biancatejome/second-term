// finding the sum

import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) throws Exception {

    // call total() method
    System.out.println("Total of the elements: " + Total());

 }

    public static int Total(){
        Scanner sc = new Scanner(System.in);
 
        int array[] = new int [3];
        int sum = 0;
        System.out.println("Enter the elements");
    
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter value " + (i+1) + " : ");
            array[i] = sc.nextInt();
            sum = sum + array[i];
        }

        return sum;
    }
}
