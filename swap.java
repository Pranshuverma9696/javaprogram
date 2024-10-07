import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
    //    System.out.println("Enter first number :");
    //    Scanner sc=new Scanner(System.in);
    //    int num1=sc.nextInt();
    //    System.out.println(num1);

    //    System.out.println("Enter second number :");
    //    int num2=sc.nextInt();
    //    System.out.println(num2);

    int a=5;
    System.out.println("the first number:"+a);
    int b=6;
    System.out.println("the second number:"+b);

    System.out.println("After swapping :");
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("the first number:"+a);
    System.out.println("the second number:"+b);
    }
    
}
