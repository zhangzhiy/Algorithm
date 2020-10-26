//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表 
// 👍 9387 👎 0


import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;
//3
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[0];






        //01
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(target - nums[i])) {
//                return new int[]{
//                        map.get(target - nums[i]), i
//                };
//            } else {
//                map.put(nums[i], i);
//            }
//        }
//        return new int[0];
        //02
//        int[] tempNums = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            tempNums[i]=nums[i];
//        }
//        Arrays.sort(nums);
//        int start = 0;
//        int end = nums.length - 1;
//        while (start < end) {
//            if (nums[start] + nums[end] == target) {
//                int[] result = new int[2];
//                for (int i = 0; i < tempNums.length; i++) {
//                    if (tempNums[i] == nums[start]) {
//                        result[0] = i;
//                    }
//                }
//                for (int i=tempNums.length-1;i>=0;i--){
//                    if (tempNums[i] == nums[end]) {
//                        result[1] = i;
//                    }
//                }
//                return result;
//            } else if (nums[start] + nums[end] < target) {
//                start++;
//            } else {
//                end--;
//            }
//        }
//        return new int[0];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
