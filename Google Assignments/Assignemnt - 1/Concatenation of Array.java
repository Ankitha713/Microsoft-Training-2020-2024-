class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
        int len=nums.length;
        int i=0;
        while(i<ans.length){
            if(i<len){
                ans[i]=nums[i];
            }else{
                ans[i]=nums[i-len];
            }
            i++;
        }
    return ans;
    }
}
