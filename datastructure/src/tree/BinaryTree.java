package tree;

/**
 * 二叉树
 */
public class BinaryTree {
    /**
     * 头节点
     */
    public TreeNode root;

    public BinaryTree(Integer[] array) {
        root = createTreeNode(array);
    }

    private TreeNode createTreeNode(Integer[] array) {
        if (array == null) {
            return null;
        }

        TreeNode root = createTreeNode(array, 1);

        return root;
    }

    private TreeNode createTreeNode(Integer[] arr, int index) {
        if (index > arr.length) {
            return null;
        }

        Integer value = arr[index - 1];
        if (value == null) {
            return null;
        }
        TreeNode node = new TreeNode(value);

        node.left = createTreeNode(arr, index * 2);
        node.right = createTreeNode(arr, index * 2 + 1);

        return node;
    }
}
