
class Solution {
    public int firstUniqChar(String s) {

        // Step 1: Har character ki frequency count karne ke liye array
        int[] freq = new int[26];

        // Step 2: String ke har character ka count badhana 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        // Step 3: Left se right check karna
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Agar character sirf ek baar aaya hai
            if (freq[ch - 'a'] == 1) {
                return i; // Uska index return karna 
            }
        }

        // Step 4: Koi unique character nahi mila
        return -1;
    }
}
