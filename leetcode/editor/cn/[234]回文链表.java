//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 724 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList<Integer>();
//
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//       int start=0;
//        int end=list.size()-1;
//        while (start<end){
//            if(!list.get(start).equals(list.get(end))){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
        ListNode node1=head;
        ListNode node2=head;
        while (node2!=null&&node2.next!=null){
            node1=node1.next;
            node2=node2.next.next;
        }
        if(node2!=null){
            node1=node1.next;
        }
        node1=reverse(node1);

        while (node1!=null){
            if(head.val!=node1.val){
                return false;
            }
            head=head.next;
            node1=node1.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node){
        ListNode pre=null;
        while (node!=null){
            ListNode temp=node.next;
            node.next=pre;
            pre=node;
            node=temp;

        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
