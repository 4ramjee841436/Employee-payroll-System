package Pattern_Printing;

import java.util.Scanner;

public class Number_Square {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No :: ");
        int m= sc.nextInt();
        for (int i = 1; i <=m; i++) {
            for (int j = 1; j<=m; j++)
                System.out.print(j+" ");
                System.out.println();
            }

        }
    }

