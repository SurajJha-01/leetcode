class Solution {
    public String convertToTitle(int columnNumber) {

        // Store the Excel column title
        StringBuilder result = new StringBuilder();

        // Repeat until the column number becomes 0
        while (columnNumber > 0) {

            // Decrease by 1 because Excel columns start from 1, not 0
            columnNumber--;

            // Find the remainder to get a letter from A to Z (0 to 25)
            int remainder = columnNumber % 26;

            // Convert the remainder into its corresponding alphabet
            char ch = (char) ('A' + remainder);

            // Add the character to the result
            result.append(ch);

            // Divide by 26 to process the next character
            columnNumber = columnNumber / 26;
        }

        // Characters are generated in reverse order, so reverse the result
        return result.reverse().toString();
    }
}
