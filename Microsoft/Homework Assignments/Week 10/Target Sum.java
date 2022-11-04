class Solution {
    Map<String, Integer> map = new HashMap<>();
    public int findTargetSumWays(int[] nums, int S){
        return helper(nums, S, 0, 0);
    }
    private int helper(int []nums, int targetSum, int index, int sum){
        if(index==nums.length&&sum==targetSum){
            return 1;
        }if(index == nums.length && sum != targetSum){
            return 0;
        }
        String key=sum+"()"+index;
        if(map.containsKey(key)){
            return map.get(key);
        }
        
        int count=0;
        count+=helper(nums,targetSum,index+1,sum-nums[index]);
        count+=helper(nums,targetSum,index+1,sum+nums[index]);
        map.put(key,count);
        return count;       
    }
}
