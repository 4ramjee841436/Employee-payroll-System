package practice_program.java;
import java.util.Scanner;
public class Array_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of Arrays:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)

        {
            System.out.println("The array of elements is:"+arr[i]);
        }
    }
}