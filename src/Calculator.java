import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int option;
        float num1;
        float num2;
        do
        {
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Addition\n5.Exit");
            System.out.println("Choose an operation");
            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter first number");
                    num1=sc.nextFloat();
                    System.out.println("Enter second number");
                    num2=sc.nextFloat();
                    System.out.println("Result is : "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    num1=sc.nextFloat();
                    System.out.println("Enter second number");
                    num2=sc.nextFloat();
                    System.out.println("Result is : "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    num1=sc.nextFloat();
                    System.out.println("Enter second number");
                    num2=sc.nextFloat();
                    System.out.println("Result is : "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter first number");
                    num1=sc.nextFloat();
                    System.out.println("Enter second number");
                    num2=sc.nextFloat();
                    System.out.println("Result is : "+(num1/num2));
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Please provide a valid number");
                    break;
            }

        }
        while(option!=5);





    }
}
