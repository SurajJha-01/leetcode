import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestPalindrome(String s) {

        Set<Character> set = new HashSet<>();
        int length = 0;

        for (char c : s.toCharArray()) {

            if (set.contains(c)) {
                set.remove(c);
                length += 2;
            } else {
                set.add(c);
            }
        }

        // Agar koi character pair nahi bana,
        // toh ek single character center mein aa sakta hai.
        if (!set.isEmpty()) {
            length++;
        }

        return length;
    }
}