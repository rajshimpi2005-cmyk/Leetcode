class Solution {
    public int missingNumber(int[] nums) {
        int xorSum = 0;

        for(int num : nums){
            xorSum = xorSum ^ num;
        }
        int n = nums.length;
        for(int i = 0; i<=n; i++){
            xorSum = xorSum ^ i;
        }

        return xorSum;
    }
    
}