class Solution {
    public int divide(int dividend, int divisor) {

        boolean negative = (dividend < 0) != (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        while (a >= b) {
            long temp = b;
            long count = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                count = count << 1;
            }
            a = a - temp;
            quotient = quotient + count;
        }

        if (negative) {
            quotient = -quotient;
        }

        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) quotient;
    }
}