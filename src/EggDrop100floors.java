public class EggDrop100floors {

    /**
     * Two eggs one hundred floors. Returning a guaranteed drop amount.
     */
    static int[][] eggDrop = new int[2][100];

    public static int leastThrows(int egg, int floors) {
        if (eggDrop[egg][floors] != -1) return eggDrop[egg][floors];
        if (egg == 1) return floors;
        if (floors == 1 || floors == 0) return floors;

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < floors; i++) {
            int noBreak = leastThrows(egg, floors - i);
            int breaks = leastThrows(egg - 1, i - 1);
            eggDrop[egg][floors - i] = noBreak;
            eggDrop[egg - 1][i - 1] = breaks;

            int res = Math.max(noBreak, breaks);

            if (res < min) min = res;
        }
        return min + 1;
    }
}
