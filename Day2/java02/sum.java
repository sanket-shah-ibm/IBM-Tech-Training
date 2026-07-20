package Day2.java02;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}
