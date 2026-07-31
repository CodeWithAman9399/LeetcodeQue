class Solution {
    public int maxArea(int[] height) {
        
       return water(height);
    }
    static int water(int[] arr) {
        int max = 0;
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int width = j - i;
            int area = Math.min(arr[i], arr[j]) * width;

            max = Math.max(max, area);

            if(arr[i]>arr[j]){
                j--;
            }
            else {
                i++;
            }

        }
        return max;

    }
}