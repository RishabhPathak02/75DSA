package Day43;

    // TreeNode definition
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Solution class (your logic)
    class Solution {
        int maxDia = 0;

        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return maxDia;
        }

        private int height(TreeNode root) {
            if (root == null) return 0;

            int left = height(root.left);
            int right = height(root.right);

            maxDia = Math.max(maxDia, left + right);

            return 1 + Math.max(left, right);
        }
    }

