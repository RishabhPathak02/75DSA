package Day48;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    TreeNode left ;
    TreeNode right ;
    int val ;
    TreeNode(){}
    TreeNode(int val){
        this.val = val ;
    }
    TreeNode(TreeNode left , TreeNode right , int val){
        this.left = left ;
        this.right = right ;
        this.val = val ;
    }
}
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer>result = new ArrayList<>();
        if(root == null)return result ;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i<size ; i++){
                TreeNode curr = q.poll();
                if(i == size-1){
                    result.add(curr.val);
                }
                if(curr.left != null)q.offer(curr.left);
                if(curr.right!= null)q.offer(curr.right);
            }
        }
        return result ;
    }
}
