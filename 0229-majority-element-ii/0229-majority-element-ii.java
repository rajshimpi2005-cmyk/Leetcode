class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int ele1=0;
      int ele2=0;
      int cnt1=0;
      int cnt2=0;

      List<Integer>ans =new ArrayList<>();

      for(int it : nums){
        if(it==ele1) cnt1++;
        else if(it==ele2) cnt2++;
        else if(cnt1==0){
            ele1=it;
            cnt1++;
        }
        else if(cnt2==0){
             ele2=it;
             cnt2++;
        }
        else{
            cnt1--;
            cnt2--;
        }
      }
    //   verify
    cnt1=0;
    cnt2=0;
    for(int it:nums){
        if(it==ele1) cnt1++;
        else if(it==ele2) cnt2++;
    }
    if(cnt1>(nums.length/3)) ans.add(ele1);

    if(cnt2>(nums.length/3)) ans.add(ele2);

    return ans;
    }

}