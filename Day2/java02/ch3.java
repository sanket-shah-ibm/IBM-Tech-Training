package Day2.java02;

public class ch3 {
    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("Prime numbers between 1 and 50:");

        for(int i=2; i<=50; i++){
            boolean isPrime = true;

            for(int j=2; j<=i/2; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("Total prime numbers = " + count);
    }
}
