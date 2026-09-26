class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int c: nums){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> freq.get(a) - freq.get(b));

        for(int n: freq.keySet()){
            minHeap.offer(n);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = minHeap.poll();
        }
        return result;        
    }
}
