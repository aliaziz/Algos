import java.util.LinkedList;

public class MergeOverlappingIntervals {

    public int[][] merge(int[][] intervals) {
        //Have a merged list with an accessible last element.
        //If end - 1 is greater than or equal to start,  merge start with end and add to list.
        LinkedList<int[]> list = new LinkedList<>();

        for (int[] interval : intervals) {
            if (list.isEmpty()) {
                list.add(interval);
            } else {
                int[] a = list.getLast();
                int end = a[1];
                int start = interval[0];

                if (end > start) a[1] = interval[1];
                else list.add(interval);
            }
        }
        return list.toArray(new int[0][]);
    }
}
