public class RopeCuttingGetProduct {
    public static int helper(int k) {
        if(k == 1 || k == 0) return 0;

        int maxVal = 0;
        for (int i = 1; i < k; i++) {
            maxVal = Math.max(Math.max(helper(k - i) * i, i * (k - i) ), maxVal);
        }
        return maxVal;
    }
}
