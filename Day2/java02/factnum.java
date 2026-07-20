package Day2.java02;

public class factnum {
    public static void main(String[] args) {
        int n = 10, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("10! = " + fact);
    }
}
