//给定两个数组，编写一个函数来计算它们的交集。 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
//
// 
//
// 说明： 
//
// 
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。 
// 我们可以不考虑输出结果的顺序。 
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
// Related Topics 排序 哈希表 双指针 二分查找 
// 👍 406 👎 0


import java.util.Arrays;
import java.util.HashMap;
//02
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int count=map.getOrDefault(nums1[i], 0)+1;
            map.put(nums1[i], count);
        }
        int index = 0;

        for (int i = 0; i < nums2.length; i++) {
            if (map.getOrDefault(nums2[i],0)>0) {
                nums1[index++] = nums2[i];
                int count=map.get(nums2[i])-1;
                if (count>0) {
                    map.put(nums2[i],count);
                } else {
                    map.remove(nums2[i]);
                }
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums1[i];
        }
        return result;



//        if (nums1.length > nums2.length) {
//            intersect(nums2, nums1);
//        }
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums1.length; i++) {
//            int count=map.getOrDefault(nums1[i], 0)+1;
//            map.put(nums1[i], count);
//        }
//        int index = 0;
//        int[] result = new int[nums1.length];
//        for (int i = 0; i < nums2.length; i++) {
//            if (map.getOrDefault(nums2[i],0)>0) {
//                result[index++] = nums2[i];
//                int count=map.get(nums2[i])-1;
//                if (count>0) {
//                    map.put(nums2[i],count);
//                } else {
//                    map.remove(nums2[i]);
//                }
//            }
//        }
//
//        return Arrays.copyOfRange(result,0,index);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
