class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        Map <Integer,Integer> mp = new HashMap<>();

        for (int i = 0; i<=n-1;i++){
            int sum = arr[i];
            int rem = target - sum ;

            if(mp.containsKey(rem)){
                return new int [] {mp.get(rem),i};
            }
            mp.put(arr[i],i);

        }
        
        return new int[] {-1,-1};
        
    }
}