class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

         
        for(int el : nums1){
            set.add(el);
        }
         HashSet<Integer>result = new HashSet<>();
         for(int el: nums2){
            if(set.contains(el)){
                result.add(el);
            }
         }

         int [] ans = new int[result.size()];
         int i = 0;
         for(int num: result){
            ans[i++] = num;
         }

         return ans;

    }
}