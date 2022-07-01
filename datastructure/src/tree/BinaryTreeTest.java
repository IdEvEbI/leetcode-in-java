package tree;

public class BinaryTreeTest {
    public static void main(String[] args) {

        System.out.println(new BinaryTree(null).root);
        System.out.println(new BinaryTree(new Integer[]{}).root);
        System.out.println(new BinaryTree(new Integer[]{null}).root);

        System.out.println(new BinaryTree(new Integer[]{1, 2, 3, null, null, 4, 5}).root);
        System.out.println(new BinaryTree(new Integer[]{1, 2, 3, null, null, 4, 5, null, null, null, null, 7, null, null, 8}).root);
        System.out.println(new BinaryTree(new Integer[]{2, null, 4, null, null, 9, 8, null, null, null, null, null, null, 4}).root);
    }
}
