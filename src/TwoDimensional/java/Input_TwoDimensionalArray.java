package TwoDimensional.java;

import java.util.Scanner;
public class Input_TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [][]arr =new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
//                System.out.print("Enter Array Elements : ");
                 arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
