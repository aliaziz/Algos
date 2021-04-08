import java.util.ArrayList;
import java.util.List;

public class Spiral2D {

    public static List<Integer> spiral2D(List<List<Integer>> list) {
        List<Integer> ordering = new ArrayList<>();
        for (int offset = 0; offset < Math.ceil(0.5 * list.size()); offset++) {
            spiral2D(list, offset, ordering);
        }
        System.out.println(ordering.toString());
        return ordering;
    }

    public static void spiral2D(List<List<Integer>> list, int offset, List<Integer> order) {
        if(offset == list.size() - offset - 1) {
            order.add(list.get(offset).get(offset));
        }
        for (int i = offset; i < list.size() - offset - 1 ; i++) {
            order.add(list.get(offset).get(i));
        }

        for (int i = offset; i < list.size() - offset - 1; i++) {
            order.add(list.get(i).get(list.size() - offset - 1));
        }

        for (int i = list.size() - offset - 1; i > offset; i--) {
            order.add(list.get(list.size() - offset - 1).get(i));
        }

        for (int i = list.size() - offset - 1; i > offset; i--) {
            order.add(list.get(i).get(offset));
        }
    }
}
