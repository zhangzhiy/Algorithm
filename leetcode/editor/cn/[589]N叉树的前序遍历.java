//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 111 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list =new ArrayList<>();
        traversal(root,list);
        return list;
    }

    private void traversal(Node root,List<Integer> list){
        if(root!=null){
            list.add(root.val);
            if(root.children!=null&&!root.children.isEmpty()){
                for (int i = 0; i < root.children.size(); i++) {
                    traversal(root.children.get(i),list);
                }
            }
        }
    }
}
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//leetcode submit region end(Prohibit modification and deletion)
