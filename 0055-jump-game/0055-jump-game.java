class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // Is index tak pahunch nahi sakte
            if (i > maxReach) {
                return false;
            }

            // Maximum reachable position update 
            maxReach = Math.max(maxReach, i + nums[i]);

            // Last index reachable hai
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}