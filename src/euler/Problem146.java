package euler;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Klaudioz on 04-Aug-16.
 */
public class Problem146 {
    public static void main(String[] args) {
        int number;
        int sum;
        int[] a = new int[6];
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            sum = 0;
            number = sc.nextInt();
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            a[3] = sc.nextInt();
            a[4] = sc.nextInt();
            a[5] = sc.nextInt();

            for (long j = 10; j < number; j += 10) {
                long squared = j * j;
                if (squared % 3 != 1)
                    continue;
                if (squared % 7 != 2 && squared % 7 != 3)
                    continue;
                if (squared % 9 == 0 || squared % 13 == 0 || squared % 27 == 0)
                    continue;
                if ((j * j + 1) % 2 != 0)
                    if (isPrime(j * j + a[0]) && isPrime(j * j + a[1]) && isPrime(j * j + a[2]) && isPrime(j * j + a[3]) && isPrime(j * j + a[4]) && isPrime(j * j + a[5]))
                        if (nextPrime(j * j + a[0]) == j * j + a[1] && nextPrime(j * j + a[1]) == j * j + a[2] && nextPrime(j * j + a[2]) == j * j + a[3] && nextPrime(j * j + a[3]) == j * j + a[4] && nextPrime(j * j + a[4]) == j * j + a[5])
                            sum += j;
            }
            System.out.println(sum);
        }
        sc.close();
    }

    private static long nextPrime(long n) {
        for (long i = n + 2; ; i += 2)
            if (isPrime(i))
                return i;
    }

    private static boolean isPrime(long n) {
        if (n % 2 == 0)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
