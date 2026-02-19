package Day44;

public class Main {
    // Inorder traversal for checking result
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        /*
                4
               / \
              2   7
             / \ / \
            1  3 6  9
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Before Inversion (Inorder): ");
        inorder(root);

        Solution sol = new Solution();
        sol.invertTree(root);

        System.out.println("\nAfter Inversion (Inorder): ");
        inorder(root);
    }
}
