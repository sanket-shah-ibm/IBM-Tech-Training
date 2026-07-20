package Day2.java02;
import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String s2 = sc.nextLine();

        anagramCheck(s1, s2);

        sc.close();
    }

    public static boolean anagramCheck(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Given strings are anagram.");
            return true;
        }
        else{
            System.out.println("Given strings are not anagram.");
            return false;
        }
    }
}
