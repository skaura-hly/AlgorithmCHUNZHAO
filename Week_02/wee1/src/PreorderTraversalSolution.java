/**
 * @author yanglong
 * @date 2021/1/31
 * 二叉树前序遍历
 */
public class PreorderTraversalSolution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack <TreeNode> stk = new Stack<>();
        while (root != null || stk.size()>0) {
            if (root != null) {
                res.add(root.val);
                stk.push(root);
                root = root.left;
            }else {
                root = stk.pop();
                root = root.right;
            }
        }
        return res;
    }
}
