class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int RightSum[] = new int[n];

        // fill left sum vala array
        leftSum[0]= nums[0];
        for(int i=1; i<n ;i++){
            leftSum[i] = leftSum[i-1] + nums[i];

        }
        // fill Right sum vala array
        RightSum[n-1]= nums[n-1];
        for(int i=n-2; i>=0 ;i--){
            RightSum[i] = RightSum[i+1] + nums[i];

        }
        //Check for Equlity
        for(int i =0; i<n; i++){
            if(leftSum[i] == RightSum[i]){
                return i;
        }
        }
        return -1;
    }
}
