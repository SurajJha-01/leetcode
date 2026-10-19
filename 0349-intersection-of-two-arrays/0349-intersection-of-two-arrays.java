import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // nums1 ke saare unique numbers store 
        for (int num : nums1) {
            set.add(num);
        }

        // nums2 ke numbers check 
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Set ko int array mein convert 
        int[] answer = new int[result.size()];
        int i = 0;

        for (int num : result) {
            answer[i] = num;
            i++;
        }

        return answer;
    }
}