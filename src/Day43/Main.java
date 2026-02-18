package Day43;

public class Main {
        public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);

            Solution sol = new Solution();
            int result = sol.diameterOfBinaryTree(root);

            System.out.println("Diameter of Binary Tree: " + result);
        }
    }
