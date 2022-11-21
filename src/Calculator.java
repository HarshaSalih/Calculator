import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Addition\n5.Other");

        System.out.println("Choose an operation");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        System.out.println("Enter first number");
        float num1=sc.nextInt();
        System.out.println("Enter second number");
        float num2=sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Result is : "+(num1+num2));
            case 2:
                System.out.println("Result is "+(num1-num2));
        }





    }
}
