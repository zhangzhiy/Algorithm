//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串 
// 👍 502 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
//1
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<String, List<String>>();
        for (String str :strs) {
            char[] arrays=str.toCharArray();
            Arrays.sort(arrays);
            String key=String.valueOf(arrays);
            List<String> value=map.getOrDefault(key,new ArrayList<String>());
            value.add(str);
            map.put(key,value);
        }

        return new ArrayList(map.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)
