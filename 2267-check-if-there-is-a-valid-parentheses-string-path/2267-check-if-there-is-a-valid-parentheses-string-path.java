class Solution {
    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // A valid parentheses string always has even length.
        int length = m + n - 1;

        if (length % 2 != 0) {
            return false;
        }

        /*
         * dp[i][j][balance] means:
         * Can we reach cell (i, j) with this balance?
         *
         * balance:
         * '(' -> +1
         * ')' -> -1
         */
        boolean[][][] dp = new boolean[m][n][length + 1];

        // The path must start with '('.
        if (grid[0][0] == ')') {
            return false;
        }

        // At the starting cell, balance is 1.
        dp[0][0][1] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // We already handled the starting cell.
                if (i == 0 && j == 0) {
                    continue;
                }

                // Check all possible balances before reaching this cell.
                for (int balance = 0; balance <= length; balance++) {

                    boolean possible = false;

                    // We can come from the cell above.
                    if (i > 0 && dp[i - 1][j][balance]) {
                        possible = true;
                    }

                    // Or we can come from the cell on the left.
                    if (j > 0 && dp[i][j - 1][balance]) {
                        possible = true;
                    }

                    if (!possible) {
                        continue;
                    }

                    int newBalance = balance;

                    // Current cell contains '('.
                    if (grid[i][j] == '(') {
                        newBalance++;
                    } 
                    // Current cell contains ')'.
                    else {
                        newBalance--;
                    }

                    // A valid parentheses string can never have
                    // more ')' than '(' at any point.
                    if (newBalance >= 0 && newBalance <= length) {
                        dp[i][j][newBalance] = true;
                    }
                }
            }
        }

        // At the last cell, balance must become exactly 0.
        return dp[m - 1][n - 1][0];
    }
}