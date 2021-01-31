/**
 * @author yanglong
 * @date 2021/1/31
 * n叉树层序遍历
 */
public class LevelOrderSolution {
    private List<List<Integer>>  res= new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root !=null) order(root,0);
        return res;
    }
    private void order(Node root,int level){
        if(res.size()<= level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        for (Node node : root.children) {
            order(node,level+1);
        }
    }
}
