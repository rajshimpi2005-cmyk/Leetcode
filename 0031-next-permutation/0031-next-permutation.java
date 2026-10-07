class Solution {
    public static void reverse(int nums[],int s ,int e){
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
    public static void swap(int nums[] , int a , int b){
    int temp=nums[a];
    nums[a]=nums[b];
    nums[b]=temp;
    }
    public void nextPermutation(int[] nums) {
       int n=nums.length;
       int index = -1; 

    //    step 1 
    for(int i=n-2;i>=0;i--){
        if(nums[i]<nums[i+1]){
            index=i;
            break;
        }
    }
    // if no break point 
    if(index==-1){
        reverse(nums,0,n-1);
        return;
    }
    // step 2 
    // find just greater element 
    for(int i=n-1;i>=index;i--){
    if(nums[index]<nums[i]){
        swap(nums,index,i);
        break;
    }
    }
    // step 3 remaining portion reverse 
    reverse(nums,index+1,n-1);
    }
}