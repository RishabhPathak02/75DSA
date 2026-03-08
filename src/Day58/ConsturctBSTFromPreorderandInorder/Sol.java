package Day58.ConsturctBSTFromPreorderandInorder;

import java.util.Map;
import java.util.HashMap;
public class Sol {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        Map<Integer, Integer> map = new HashMap<>();
        int preIndx = 0;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            for (int i = 0; i < inorder.length; i++) {
                map.put(inorder[i], i);
            }
            return build(preorder, 0, inorder.length - 1);
        }

        private TreeNode build(int[] preorder, int start, int end) {
            if (start > end)
                return null;
            int rootval = preorder[preIndx++];
            TreeNode root = new TreeNode(rootval);
            int index = map.get(rootval);
            root.left = build(preorder, start, index - 1);
            root.right = build(preorder, index + 1, end);
            return root;
        }
    }
}
