//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。 
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: nums = [1,2,3]
//输出:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics 位运算 数组 回溯算法 
// 👍 868 👎 0


import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> list =new ArrayList<>();
    List<Integer> temp =new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        calu(nums,0);
        return list;

    }

    private void calu(int[] nums, int index){
        if(index==nums.length){
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        calu(nums,index+1);
        temp.add(nums[index]);
        calu(nums,index+1);

        temp.remove(temp.size()-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
