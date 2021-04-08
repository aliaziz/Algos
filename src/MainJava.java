import java.util.*;

/**
 * This is the TESTING GROUND/PLAYGROUND
 */
public class MainJava {

    public  static void main(String[] args) {
//        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3, 40),
//                Arrays.asList(4, 5, 6, 70),
//                Arrays.asList(7, 8, 9, 100),
//                Arrays.asList(10, 11, 12, 120));
//        spiral2D(lists);
        OurTreeNode treeNode = new OurTreeNode(3);
        OurTreeNode leftNode = new OurTreeNode(2, new OurTreeNode(1), new OurTreeNode(3));
        OurTreeNode rightNode = new OurTreeNode(4, new OurTreeNode(3), new OurTreeNode(5));
        treeNode.left = leftNode;
        treeNode.right = rightNode;

        System.out.println(treeNode.getChildrenCount(treeNode));
        System.out.println(treeNode.getHeight(treeNode));
    }
}
