class Solution {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for(int i = 1; i <= nums.length-1; i++){
            xor = nums[i] ^ xor;
        }
        return xor;
    }
}
