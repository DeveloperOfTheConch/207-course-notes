/**
 * Exercise (Chapter 1: Introduction to Java) — while loops and integer
 * arithmetic.
 *
 * Complete {@link #digitSum(int)} below using a while loop.
 *
 * Relevant reading: 1.8.3. while Loops (and 1.2. Variables and Types).
 */
public class DigitSum {

    public static void main(String[] args) {
        // Should print 15 (1 + 2 + 3 + 4 + 5) once digitSum is implemented.
        System.out.println("digitSum(12345) = " + digitSum(12345));
    }

    /**
     * Returns the sum of the decimal digits of {@code n}. Negative numbers are
     * treated by their absolute value, so {@code digitSum(-123) == 6}.
     *
     * @param n any int
     * @return the sum of its decimal digits
     */
    public static int digitSum(int n) {
        int num = n;
        int fin = 0;
        if (num<0)
            num = num*-1;
        int place = 10;
        while (place<(num*10)){
            int digit = 10*(num % place)/place;
            num-=digit;
            fin+=digit;
            place*=10;
            System.out.println(fin);
        }
        return fin;
    }
}
