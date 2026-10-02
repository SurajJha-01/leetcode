class Solution {

    public List<String> generateParenthesis(int n) {

        // Saare valid combinations yahan store honge
        List<String> result = new ArrayList<>();

        // Backtracking start 
        backtrack(result, "", 0, 0, n);

        return result;
    }

    private void backtrack(
            List<String> result,
            String current,
            int open,
            int close,
            int n) {

        // Agar 2*n brackets use ho gaye
        if (current.length() == 2 * n) {

            // Valid combination ko result mein add karna
            result.add(current);

            return;
        }

        // Agar opening brackets abhi baaki hain
        if (open < n) {

            // '(' add 
            backtrack(
                result,
                current + "(",
                open + 1,
                close,
                n
            );
        }

        // ')' tabhi add karenge jab
        // opening brackets zyada hain
        if (close < open) {

            // ')' add 
            backtrack(
                result,
                current + ")",
                open,
                close + 1,
                n
            );
        }
    }
}