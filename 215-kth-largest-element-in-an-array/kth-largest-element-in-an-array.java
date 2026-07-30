class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer> minHeap = new PriorityQueue();

        for(int stone:nums){
            minHeap.offer(stone);
            if(minHeap.size()>k){
                minHeap.poll();
            } 
        }
        return minHeap.poll();
        
    }
}