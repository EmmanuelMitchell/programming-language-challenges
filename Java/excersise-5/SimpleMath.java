
import java.util.Scanner;


class  SimpleMath {
    public static void main (String []args){
        int firstNum;
        int secondNum;

        /*  
        You’ll often write programs that deal with numbers. And
        depending on the programming language you use, you’ll
        have to convert the inputs you get to numerical data types.
        Write a program that prompts for two numbers. Print the
        sum, difference, product, and quotient of those numbers as
        shown in the example output

        */
       Scanner scanner = new Scanner(System.in);

       System.out.println("What is the first number?: ");
       firstNum = scanner.nextInt();

       System.out.println("What is the first number?: ");
       secondNum = scanner.nextInt();

       int resutl = firstNum + secondNum;
       int resutl2 = firstNum - secondNum;
       int resutl3 = firstNum * secondNum;
       int resutl4 = firstNum / secondNum;

       System.out.println("sum "+ resutl);
       System.out.println("difference, "+ resutl2);
       System.out.println("product "+ resutl3);
       System.out.println("quotient "+ resutl4);


    }
}