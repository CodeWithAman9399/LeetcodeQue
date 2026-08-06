class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     
     List<List<Integer>> ans = new ArrayList<>();
      helper(candidates, 0 , target, ans, new ArrayList<>());

        return ans;

    }
    void helper(int [ ] arr, int idx, int target, List<List<Integer>> ans , List<Integer> path){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList(path));
            }
            return;
        }
        if(arr[idx]<=target){
            path.add(arr[idx]);
            helper(arr,idx,target-arr[idx],ans,path);
            path.remove(path.size()-1);
        }
        helper (arr,idx+1,target,ans, path);
        
    }
}