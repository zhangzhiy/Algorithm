//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 69 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        int size=0;
        ListNode tempNode=head;
        while (tempNode !=null){
            size++;
            tempNode=tempNode.next;
        }
        int[] array=new int[size];
        while (head !=null){
           array[size-1]=head.val;
           size--;
            head=head.next;
        }
        return array;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
