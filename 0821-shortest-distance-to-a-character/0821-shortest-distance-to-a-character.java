class Solution {
    public int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] answer = new int[n];

        int distance = n;

        // First pass: left to right
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = distance;
        }

        distance = n;

        // Second pass: right to left
        for (int i = n - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = Math.min(answer[i], distance);
        }

        return answer;
    }
}