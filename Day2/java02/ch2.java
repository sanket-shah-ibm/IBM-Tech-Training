package Day2.java02;
import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 numbers:");

        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<5; i++){
            sum += arr[i];
            
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        double avg = sum/5;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        sc.close();
    }
}
