class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){

            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String st = String.valueOf(chars);
            
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
