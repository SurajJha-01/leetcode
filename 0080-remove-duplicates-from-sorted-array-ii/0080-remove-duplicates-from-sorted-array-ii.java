class Solution {
    public int removeDuplicates(int[] nums) {

        int w = 0;
        for (int R = 0; R < nums.length; R++) {
             if (w < 2 || nums[R] != nums[w - 2]) {

                nums[w] = nums[R];
                w++;
            }
        }

        return w;
    }
}