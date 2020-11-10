//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。 
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法 
// 👍 432 👎 0


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    List<List<Integer>> list = new ArrayList();

    public List<List<Integer>> combine(int n, int k) {
        calu(1, n, k, new ArrayList<Integer>());
        return list;
    }

    private void calu(int index, int n, int k, List<Integer> currentList) {
        if (k == 0) {
            list.add(new ArrayList<Integer>(currentList));
            return;
        }
        for (int i = index; i <= n - k + 1; i++) {
            currentList.add(i);
            calu(i + 1, n, k - 1, currentList);
            currentList.remove(currentList.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
