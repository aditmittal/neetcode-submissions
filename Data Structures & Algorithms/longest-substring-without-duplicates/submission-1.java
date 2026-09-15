class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count=0;
        Set<Character> set = new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;count--;
            }
            set.add(c);
            count++;
            max = Math.max(count, max);
        }
        return max;
    }
}
