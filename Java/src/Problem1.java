/**
 * Multiples of 3 and 5
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int limiter = 1000;
        int threeMultiple, fiveMultiple;

        while(true) {
            threeMultiple = 3 * count;
            fiveMultiple = 5 * count;

            if (threeMultiple < limiter && ((threeMultiple % 5) != 0)) {
                sum += threeMultiple;
            }

            if (fiveMultiple < limiter) {
                sum += fiveMultiple;
            }

            if ((threeMultiple >= limiter) && (fiveMultiple >= limiter)) {
                break;
            }

            count++;
        }

        System.out.println("Sum: " + sum);
    }
}
