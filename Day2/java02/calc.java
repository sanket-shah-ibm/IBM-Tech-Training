package Day2.java02;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        // System.out.println("Hello\tworld!");
        // int a = 10, b = 20;
        // System.out.println("Addition: "+ (a+b));
        // System.out.println("Multiplication: "+ (a*b));

        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 6) {
            System.out.print("Enter First Number: ");
            Double n1 = sc.nextDouble();
            
            System.out.print("Enter Second Number: ");
            Double n2 = sc.nextDouble();

            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Division");
            System.out.println("4. Substraction");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.print("Enter your choice of operations from above: ");

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Addition: "+ (n1+n2));
                    break;
                case 2:
                    System.out.println("Multiplication: "+ (n1*n2));
                    break;
                case 3:
                    System.out.println("Division: "+ (n1/n2));
                    break;
                case 4:
                    System.out.println("Substraction: "+ (n1-n2));
                    break;
                case 5:
                    System.out.println("Modulus: "+ (n1%n2));
                    break;
                case 6:
                    System.out.println("Exit successfully");
                    break;
            
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        sc.close();
    }
}