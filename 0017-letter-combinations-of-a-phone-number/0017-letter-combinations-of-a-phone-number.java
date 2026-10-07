class Solution {
    public static void solve(String digits, int index ,StringBuilder output,
    String map[],List<String>ans
    ){
        // base 
        if(index==digits.length()){
         ans.add(output.toString());
         return;
        }

        int num =digits.charAt(index)-'0';
        // '2'->2
        String val =map[num];
        // 'abc'

        for(int i=0;i<val.length();i++){
            output.append(val.charAt(i));
            solve(digits,index+1,output,map,ans);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index =0;
        StringBuilder output =new StringBuilder();
        solve(digits,index,output,mapping,ans);
        return ans;
    }
}