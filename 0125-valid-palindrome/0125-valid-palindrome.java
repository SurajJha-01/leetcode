class Solution {
    public boolean isPalindrome(String s) {

        // Do pointers:
        // left -> starting 
        // right -> ending 
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Non-alphanumeric character ko skip karna 
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // Dono characters ko lowercase karke compare 
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            // Dono pointers ko andar move 
            left++;
            right--;
        }
        
        return true;
    }
}