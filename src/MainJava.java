import java.util.*;
import java.util.function.BinaryOperator;
import java.util.logging.Handler;

/**
 * This is the TESTING GROUND/PLAYGROUND
 */
public class MainJava {
    static int max = 0;

    public  static void main(String[] args) {


    }

    private static int product(List<Integer> list) {
        return list.stream().reduce((x, y) -> x * y).orElse(0);
    }
}
