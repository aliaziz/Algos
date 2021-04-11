import java.util.*;
import java.util.function.BinaryOperator;

/**
 * This is the TESTING GROUND/PLAYGROUND
 */
public class MainJava {
    static int max = 0;

    public  static void main(String[] args) {

        //Rope can be k length
        //max prod of the subset of k
        // if k is 4, (3,1)(2,2)(1,1,1,1)(1,1,2)

    }

    private static int product(List<Integer> list) {
        return list.stream().reduce((x, y) -> x * y).orElse(0);
    }
}
