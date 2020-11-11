//有些数的素因子只有 3，5，7，请设计一个算法找出第 k 个数。注意，不是必须有这些素因子，而是必须不包含其他的素因子。例如，前几个数按顺序应该是 1，3，
//5，7，9，15，21。 
//
// 示例 1: 
//
// 输入: k = 5
//
//输出: 9
// 
// Related Topics 堆 队列 数学 
// 👍 37 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int getKthMagicNumber(int k) {
        if(k==0){
            return 0;
        }
        int[] nums=new int[k+1];
        int i=0;
        int j=0;
        int d=0;
        nums[0]=1;
        for (int m=1;m<k;m++){
            int temp=Math.min(nums[j]*5,nums[d]*7);
            nums[m]=Math.min(nums[i]*3,temp);
            if(nums[m]==nums[i]*3) i++;
            if(nums[m]==nums[j]*5) j++;
            if(nums[m]==nums[d]*7) d++;
        }
        return nums[k-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
