package euler;

/**
 * Created by klaud on 03-Aug-16.
 */
public class Problem146 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=11;i<10000;i++)
            if((isPrime(Math.pow(i, 2) + 1) && isPrime(Math.pow(i, 2) + 3) && isPrime(Math.pow(i, 2) + 7) && isPrime(Math.pow(i, 2) + 9) && isPrime(Math.pow(i, 2) + 13) && isPrime(Math.pow(i, 2) + 27))&&
                    (!isPrime(Math.pow(i, 2) + 5) && !isPrime(Math.pow(i, 2) + 11) && !isPrime(Math.pow(i, 2) + 15) && !isPrime(Math.pow(i, 2) + 17) && !isPrime(Math.pow(i, 2) + 19) && !isPrime(Math.pow(i, 2) + 21) && !isPrime(Math.pow(i, 2) + 23) && !isPrime(Math.pow(i, 2) + 25)))
                sum+=i;
        System.out.println(sum);
    }

    private static boolean isPrime(Double n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
