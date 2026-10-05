class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        // Initial score
        stack.push(0);

        for (char c : s.toCharArray()) {

            if (c == '(') {
                // New level start
                stack.push(0);

            } else {
                // Current level ka score
                int current = stack.pop();

                // Previous level ka score
                int previous = stack.pop();

                // "()" => 1
                // "(A)" => 2 * A
                if (current == 0) {
                    stack.push(previous + 1);
                } else {
                    stack.push(previous + 2 * current);
                }
            }
        }

        return stack.pop();
    }
}