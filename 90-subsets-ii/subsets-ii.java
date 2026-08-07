class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Set<List<Integer>> ans = new HashSet<>();
         Arrays.sort(nums);

        subset(nums, 0, ans, new ArrayList<>());
        return new ArrayList<>(ans);
    }
    void subset(int[] nums,int idx , Set<List<Integer>> ans , List<Integer> path){
        if(idx == nums.length){
            ans.add(new ArrayList(path));
            return ;
        }
        path.add(nums[idx]);
        subset(nums,idx+1,ans,path);
        path.remove(path.size()-1);
        subset(nums,idx+1,ans,path);

    }
}