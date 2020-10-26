//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。 
//
// 
//
// 示例： 
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
// 
//
// 
//
// 提示：你可以假定该字符串只包含小写字母。 
// Related Topics 哈希表 字符串 
// 👍 277 👎 0


import java.util.ArrayList;
import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        //01
//        for (char c : s.toCharArray()) {
//            if (s.indexOf(c) == s.lastIndexOf(c)) {
//                return s.indexOf(c);
//            }
//        }
//        return -1;
        //02
//        HashMap<Character, Integer> map = new HashMap();
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for (char c : s.toCharArray()) {
//            if (map.get(c) == 1) {
//                return s.indexOf(c);
//            }
//        }
//        return -1;
        //03
        int index = -1;
        for ( char i = 'a';i <= 'z';i++){
            int startIndex = s.indexOf(i);
            if (startIndex != -1 && startIndex == s.lastIndexOf(i)) {
                if (index == -1 || index > startIndex) {
                    index = startIndex;
                }
            }
        }
        return index;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
