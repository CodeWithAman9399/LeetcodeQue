class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();

        // for(int i = 0; i< nums.length;i++){
        //     set.add(nums[i]);
        // }
        // if(set.size() != nums.length){
        //     return true;
        // }
        // return false;

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}