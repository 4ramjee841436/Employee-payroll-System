package Pattern_Printing;

import java.util.Scanner;

public class Triangle_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No :: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" "); //*,**,***,****,*****........

//                System.out.print((char)(j+64)+" "); //A,AB,ABC,ABCD,ABCDE......
            }
            System.out.println();
        }
    }
}