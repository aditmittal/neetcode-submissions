class Solution {
    public boolean isChar(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')||
           (c >= '0' && c <= '9');
    }
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<=j){
            if(!isChar(s.charAt(i))){
                i++;
                continue;
            }
            if(!isChar(s.charAt(j))){
                j--;
                continue;
            }
            
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;j--;
        }
        return flag;



    }
}
