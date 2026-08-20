class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int el : nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
       int maxFreq = 0;

       for(int count : map.values()){
        maxFreq = Math.max(maxFreq,count);

       }
       int ans = 0;

       for(int el : map.values()){
        if(el == maxFreq){
            ans+=el;;
        }
       }
       return ans;

    }
}