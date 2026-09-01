class Solution {
    public void rotate(int[] nums, int k) {
        rotate1(nums,k);
        
    }
    public void rotate1(int [] nums, int k){
        k = k% nums.length;
        // Roate whole array
        int j = nums.length-1;
        for(int i = 0; i<j;i++,j--){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        // reverse first k element
        j = k-1;
        for(int i = 0;i<j;i++,j--){
              int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        // reverse after k element
        j = nums.length-1;
        for(int i = k;i<j;i++,j--){
              int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}