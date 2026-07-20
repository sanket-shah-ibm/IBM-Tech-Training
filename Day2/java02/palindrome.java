package Day2.java02;

public class palindrome {
    public static void main(String[] args) {
        int n = 1221, original = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(original == rev);
    }
}
