class Solution {
    public boolean isPalindrome(int n) {
        int OriginalNumber = n;
        int reverse =0;
        if(n<0){
             return false;
        }
        while(n!=0){
        int digit = n % 10;
        reverse = reverse * 10 + digit;
        n = n/10;
        }
        
         
        if(reverse == OriginalNumber){
            return true ;
         }
        else{
            return false;
        }
        
    }
}