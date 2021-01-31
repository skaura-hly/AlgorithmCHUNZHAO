import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author yanglong
 * @date 2021/1/31
 * n叉树后序遍历
 */
public class PostorderSolution {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root ==null) return res;
        Stack<Node> stk =new Stack<>();
        stk.add(root);
        while(stk.size()>0){
            root = stk.pop();
            res.add(root.val);
            for(Node node:root.children){
                stk.push(node);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
