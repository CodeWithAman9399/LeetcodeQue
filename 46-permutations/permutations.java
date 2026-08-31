class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
         permute1(new ArrayList<>(),nums,ans);
        return ans ;
    }
    static void permute1(List<Integer> p, int[] up, List<List<Integer>> ans) {
        // Base case
        if (up.length == 0) {
            ans.add(new ArrayList<>(p));
            return;
        }
        int ch = up[0];
        // Insert ch at every possible position
        for (int i = 0; i <= p.size(); i++) {
            List<Integer> newP = new ArrayList<>(p);
            newP.add(i, ch);
            int[] newUp = Arrays.copyOfRange(up, 1, up.length);
            permute1(newP, newUp, ans);
        }
    }
}