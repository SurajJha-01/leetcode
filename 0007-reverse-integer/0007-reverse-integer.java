class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            // find last digit
            int digit = x % 10;

            // Overflow check for positive number
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Overflow check for negative number
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // make Reverse number
            rev = rev * 10 + digit;

            // Original number ka last digit remove
            x = x / 10;
        }

        return rev;
    }
}