package Reursion;
import java.util.Scanner;
public class Fibonacci_function {
    public static int fibo(int n)
    {
        if(n<=1)
            return  n;
     return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ---> ");
        int n= sc.nextInt();
        System.out.println("The "+n+"th"+" fibonacci number is ---> "+fibo(n));
    }
}
