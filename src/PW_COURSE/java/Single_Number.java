package PW_COURSE.java;
import java.util.Scanner;
public class Single_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0;i<n;i++)
        {

            arr[i]= sc.nextInt();
        }
        int single=0;
        for(int ele: arr)
        {
            single ^= ele;
        }
        System.out.println("Single Element in the array is : "+single);
    }
}
