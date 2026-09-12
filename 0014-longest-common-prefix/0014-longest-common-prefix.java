class Solution {
    public String longestCommonPrefix(String[] strs) {

        // First string ko reference maan rahe hain
        String prefix = strs[0];

        // Baaki sabhi strings ke saath compare karenge
        for (int i = 1; i < strs.length; i++) {

            int j = 0;

            // Jab tak characters same hain, aage badho
            while (j < prefix.length() &&
                   j < strs[i].length() &&
                   prefix.charAt(j) == strs[i].charAt(j)) {

                j++;
            }

            // Jitne characters same mile,
            // prefix ko utne characters tak chhota kar do
            prefix = prefix.substring(0, j);

            // Agar common prefix empty ho gaya
            if (prefix.length() == 0) {
                return "";
            }
        }

        // Final longest common prefix return karo
        return prefix;
    }
}