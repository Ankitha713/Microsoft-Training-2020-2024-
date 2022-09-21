int  removeDuplicates(int* nums, int numsSize){
      int i=0,j=0,count=0;
    for(i=0;i<numsSize;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
                }
        }
    return j+1;
}
