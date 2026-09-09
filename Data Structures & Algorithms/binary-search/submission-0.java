class Solution {
    public int findMid(int[] nums, int target, int l, int r){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
            
        return -1;
    }
    public int search(int[] nums, int target) {
        return findMid(nums, target, 0, nums.length-1);
    }
}
