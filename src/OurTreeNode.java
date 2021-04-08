public class OurTreeNode {
    public int val;
    public OurTreeNode left;
    public OurTreeNode right;

    public OurTreeNode(int val) {
        this.val = val;
    }

    public OurTreeNode(int val, OurTreeNode left, OurTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Get binary tree child count
     * @param node
     * @return
     */
    protected int getChildrenCount(OurTreeNode node) {
        if(node == null) return 0;
        int leftHeight = getChildrenCount(node.left);
        int rightHeight = getChildrenCount(node.right);
        return 1 + leftHeight + rightHeight;
    }

    /**
     * Get BT height
     * @param node
     * @return
     */
    public int getHeight(OurTreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 0;

        int leftHeight = 1 + getHeight(node.left);
        int rightHeight = 1 + getHeight(node.right);
        return Math.max(leftHeight, rightHeight);
    }
}
