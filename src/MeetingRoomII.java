import java.util.*;

public class MeetingRoomII {
    static class A {
        String name;
    }
    public static int minMeetingRooms(int[][] intervals) {
        String s = new A().name;
        //Create a queue with starting room
         PriorityQueue<Integer> q = new PriorityQueue<>((a, b) ->  a - b);
         Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
         q.add(intervals[0][1]); //add end time of meeting.

        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        ArrayList<Integer> l = new ArrayList<Integer>();
         for(int i = 1; i < intervals.length; i++) {
             if(intervals[i][0] >= q.peek()) {
                 q.poll();
             }

             q.add(intervals[i][1]);
         }
         return q.size();

        /* USING A PAIR
        PriorityQueue<Pair> q = new PriorityQueue<>((o1, o2) -> o1.startTime - o2.startTime);

        for(int [] ints : intervals) {
            q.add(new Pair(ints[0], ints[1]));
        }

        PriorityQueue<Pair> e =
                new PriorityQueue<>((o1, o2) -> o1.startTime - o2.startTime);
        int m = 0;

        while(!q.isEmpty()) {
            Pair p = q.poll();
            int startTime = p.startTime;
            int endTime = p.endTime;

            if(e.isEmpty() || e.peek().startTime > startTime) {
                m = m + 1;
                e.add(new Pair(endTime, m));
            } else {
                Pair removed = e.poll();
                e.add(new Pair(endTime, removed.endTime));
            }
        }
        System.out.println(e.toString());
        return m;*/
    }
}
