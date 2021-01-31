/**
 * @author yanglong
 * @date 2021/1/31
 * n叉树前序遍历
 */
public class preorderSolution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node > stack = new Stack<>();
        if (root == null) return res;
        stack.add(root);
        while(stack.size()>0){
            root = stack.pop();
            res.add(root.val);
            for(int i = root.children.size()-1;i>=0;i--){
                stack.add(root.children.get(i));
            }

        }
        return res;
    }
}
