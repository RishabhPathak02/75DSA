package Day42;

public class Main {
        public static void main(String[] args) {

        /*
                1
               / \
              2   3
             /
            4
        */

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);

            Solution sol = new Solution();
            int depth = sol.maxDepth(root);

            System.out.println("Maximum Depth: " + depth);
        }
}
