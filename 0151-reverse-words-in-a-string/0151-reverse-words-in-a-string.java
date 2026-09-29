class Solution {
    public String reverseWords(String s) {

        // First remove extra spaces from the beginning and end
        // and split the string wherever there are one or more spaces.
        String[] words = s.trim().split("\\s+");

        // We will build the answer from the last word to the first word.
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            // Add a space before every word except the first one.
            if (result.length() > 0) {
                result.append(" ");
            }

            result.append(words[i]);
        }

        return result.toString();
    }
}