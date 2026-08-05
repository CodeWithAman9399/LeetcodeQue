class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
     List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
        
    }
    
    void helper(int[] nums, int target, int idx,List<Integer> path,List<List<Integer>>ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (idx == nums.length || target < 0) {
            return;
        }

        
        path.add(nums[idx]);
        helper(nums, target - nums[idx], idx, path, ans);
        path.remove(path.size() - 1);

        
        helper(nums, target, idx + 1, path, ans);
    }

}