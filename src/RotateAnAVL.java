import org.w3c.dom.Node;

public class RotateAnAVL {
    static class Node {
        int val;	//Value
        int ht;		//Height
        Node left;	//Left child
        Node right;	//Right child
    }

    static Node insert(Node root, int val) {
        //To insert, we need to create a new node.
        //check if val is left than root, insert left otherwise insert right.
        //While inserting, maintain a 2 sized queue, to keep track of the last steps we've
        //made.(These will determine the rotation)

        //Calculate height of nodes.

        //Find unbalanced side. Using leftHeight - rightHeight
        //If greater than 1 go to the left node or less than -1 go to right node.
        //If we find a node that is balanced, we use our queue to now balance the parent.
        //If first value in queue says left, we make
        if (root == null) {
            root = new Node();
            root.val = val;
            root.ht = setHeight(root);
            return root;
        }
        if (val <= root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        int balance = height(root.left) - height(root.right);

        if (balance > 1) {
            if (height(root.left.left) < height(root.left.right)) {
                root.left = leftRotation(root.left); //Very key line
            }
            root = rightRotation(root);
        } else if (balance < -1) {
            if (height(root.right.right) < height(root.right.left)) {
                root.right = rightRotation(root.right); //Very key line
            }
            root = leftRotation(root);
        } else {
            root.ht = setHeight(root);
        }
        return root;
    }

    private static Node rightRotation(Node root) {
        Node nextRoot = root.left;
        root.left = nextRoot.right;
        nextRoot.right = root;
        root.ht = setHeight(root);
        nextRoot.ht = setHeight(nextRoot);
        return nextRoot;
    }

    private static Node leftRotation(Node root) {
        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        root.ht = setHeight(root);
        newRoot.ht = setHeight(newRoot);
        return newRoot;
    }

    private static int height(Node root) {
        if (root == null)
            return -1;
        else
            return root.ht;
    }

    private static int setHeight(Node root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }


}
