//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        calu(0,nums,new ArrayList<Integer>());
        return list;
    }
    private void calu(int index,int[] nums,ArrayList<Integer> temp){
        if(index==nums.length){
            list.add(new ArrayList(temp));
            return;
        }
        for (int i = 0; i <= index; i++) {
            temp.add(i,nums[index]);
            calu(index+1,nums,temp);
            temp.remove(i);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
