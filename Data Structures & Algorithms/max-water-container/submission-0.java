class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right = heights.length -1;

        int maxArea = 0;

        while(left<right){
            int height = right - left;

            int width = Math.min(heights[left], heights[right]);

            int area = height * width;
            maxArea = Math.max(area, maxArea);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
