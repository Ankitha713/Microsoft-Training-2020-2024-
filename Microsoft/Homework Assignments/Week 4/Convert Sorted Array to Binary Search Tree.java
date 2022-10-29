class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums,0,nums.length-1);
    }
    public static TreeNode constructBST(int []nums, int l,int r){
        if(l>r) return null;
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = constructBST(nums,l,mid-1);
        root.right = constructBST(nums,mid+1,r);
        return root;
    }
}
