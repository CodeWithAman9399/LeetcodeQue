class Solution {
    public double myPow(double x, int n) {
        long power = n;
        double ans = 1;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        for (; power > 0; power /= 2) {
            if (power % 2 == 1) {
                ans *= x;
            }

            x *= x;
        }

        return ans;
    }
}