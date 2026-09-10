class Solution {
    public int romanToInt(String s) {

        int num = 0;
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == 'M') {
                num += 1000;

            } else if (s.charAt(i) == 'D') {
                num += 500;

            } else if (s.charAt(i) == 'C') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    num -= 100;
                } else {
                    num += 100;
                }

            } else if (s.charAt(i) == 'L') {
                num += 50;

            } else if (s.charAt(i) == 'X') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    num -= 10;
                } else {
                    num += 10;
                }

            } else if (s.charAt(i) == 'V') {
                num += 5;

            } else if (s.charAt(i) == 'I') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    num -= 1;
                } else {
                    num += 1;
                }
            }

            i++;
        }

        return num;
    }
}