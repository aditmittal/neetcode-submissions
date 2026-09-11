class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) >1){
                return num;
            }
        }
        return sum;
    }
}
