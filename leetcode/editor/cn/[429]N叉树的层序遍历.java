//给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其层序遍历: 
//
// [
//     [1],
//     [3,2,4],
//     [5,6]
//]
// 
//
// 
//
// 说明: 
//
// 
// 树的深度不会超过 1000。 
// 树的节点总数不会超过 5000。 
// Related Topics 树 广度优先搜索 
// 👍 117 👎 0


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
import java.util.HashMap;
import java.util.List;

//1
class Solution {


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        traversal(root, list,0);
        return  list;
    }

    private void traversal(Node root, List<List<Integer>> list,int index) {
        if (root != null) {
            if (index == list.size()) {
                list.add(new ArrayList<Integer>());
            }
            list.get(index).add(root.val);
            if (root.children != null && !root.children.isEmpty()) {
                for (int i = 0; i < root.children.size(); i++) {
                    traversal(root.children.get(i), list,index + 1);
                }
            }
        }
    }
    //01
//    List<List<Integer>> list = new ArrayList<>();
//
//    public List<List<Integer>> levelOrder(Node root) {
//        traversal(root, 0);
//        return  list;
//    }
//
//    private void traversal(Node root, int index) {
//        if (root != null) {
//            if (index == list.size()) {
//                list.add(new ArrayList<Integer>());
//            }
//            list.get(index).add(root.val);
//            if (root.children != null && !root.children.isEmpty()) {
//                for (int i = 0; i < root.children.size(); i++) {
//                    traversal(root.children.get(i), index + 1);
//                }
//            }
//        }
//    }
//02
//    public List<List<Integer>> levelOrder(Node root) {
//        HashMap<Integer, List<Integer>> map = new HashMap<>();
//        traversal(root, map, 0);
//        return new ArrayList(map.values());
//    }
//
//    private void traversal(Node root, HashMap<Integer, List<Integer>> map, int index) {
//        if (root != null) {
//            List list = map.getOrDefault(index, new ArrayList<Integer>());
//            list.add(root.val);
//            map.put(index, list);
//            if (root.children != null && !root.children.isEmpty()) {
//                for (int i = 0; i < root.children.size(); i++) {
//                    traversal(root.children.get(i), map, index+1);
//                }
//            }
//        }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)
