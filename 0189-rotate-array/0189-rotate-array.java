class Solution {
    public void rotate(int[] nums, int k) {

        // k ko array ki length ke according reduce karo
        k = k % nums.length;

        // Step 1: Pura array reverse karo
        reverse(nums, 0, nums.length - 1);

        // Step 2: First k elements reverse karo
        reverse(nums, 0, k - 1);

        // Step 3: Baaki elements reverse karo
        reverse(nums, k, nums.length - 1);
    }

    // Array ke given part ko reverse karne ka method
    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            // Swap
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Pointers ko move karo
            left++;
            right--;
        }
    }
}