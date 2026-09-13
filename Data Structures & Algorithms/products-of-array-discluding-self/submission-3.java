class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int nzp = 1;
        int zeroCount=0;

        for(int num: nums){
            if(num!=0){
               nzp = nzp * num; 
            }else{
                zeroCount++;
            }
        }

        for(int i=0;i<n;i++){
            if(zeroCount>1){
                ans[i]=0;
            }
            else if(zeroCount==1){
                if(nums[i] == 0){
                    ans[i] = nzp;
                }else{
                    ans[i]=0;
                }
            }else{
                ans[i] = nzp/nums[i];
            }
        }
        return ans;
    }
}  
