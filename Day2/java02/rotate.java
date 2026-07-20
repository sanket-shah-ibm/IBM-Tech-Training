package Day2.java02;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        for (int i=k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i=0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
