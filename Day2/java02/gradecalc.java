package Day2.java02;
import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("Grade A");
        }
        else if (marks >= 75  & marks <= 90){
            System.out.println("Grade B");
        }
        else if (marks >= 60  & marks <= 74){
            System.out.println("Grade C");
        }
        else if (marks >= 50  & marks <= 59){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}
