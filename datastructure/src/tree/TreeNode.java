package tree;

/**
 * 树节点
 */
public class TreeNode {
    /**
     * 值
     */
    public int val;
    /**
     * 左节点
     */
    public TreeNode left;
    /**
     * 右节点
     */
    public TreeNode right;

    /**
     * 构造器
     *
     * @param val 值
     */
    public TreeNode(int val) {
        this.val = val;
    }

    /**
     * 构造器
     *
     * @param val   值
     * @param left  左子树节点
     * @param right 右子树节点
     */
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return serialize(this);
    }

    private String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        serialize(root, sb);

        return sb.toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("x").append(",");
            return;
        }
        sb.append(root.val).append(",");
        serialize(root.left, sb);
        serialize(root.right, sb);
    }
}
