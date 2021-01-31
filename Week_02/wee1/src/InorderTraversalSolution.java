/**
 * @author yanglong
 * @date 2021/1/31
 * n叉树中序遍历
 */
public class InorderTraversalSolution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res =new ArrayList();
        Stack<TreeNode> stk = new Stack();
        while(stk.size()>0 || root !=null){
            if(root!=null){
                stk.add(root);
                root = root.left;
            }else{
                TreeNode temp = stk.pop();
                res.add(temp.val);
                root = temp.right;
            }
        }
        return res;
    }
}
