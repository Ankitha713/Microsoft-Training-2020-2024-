class Solution {
    public int mySqrt(int x) {
        int i;
        if(x==0 || x ==1){
            return x;
        }
        if(x==2 || x==3)
        {
            return 1;
        }
        int first = 1, end =x/2;
        int mid = (first+end)/2;
        while(first <= end) {
            mid = (first+end)/2;
            if((long)mid*mid >x) {
                end = mid-1;
            }
            else if((long)mid*mid < x){
                first = mid+1;
            }
            else {
                return mid;
            }
            
        }
        return end;
    }
}
