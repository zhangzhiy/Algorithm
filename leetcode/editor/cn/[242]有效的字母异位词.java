//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 265 👎 0


import java.util.Arrays;
import java.util.HashMap;
//01
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] array = new int[26];
        for (int i=0;i<s.length();i++) {
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i]!=0){
                return false;
            }
        }
        return true;
        //04
//        if (s.length() != t.length()) {
//            return false;
//        }
//        int[] array = new int[26];
//        for (char c : s.toCharArray()) {
//            array[c - 'a']++;
//        }
//        for (char c : t.toCharArray()) {
//            array[c - 'a']--;
//        }
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]!=0){
//                return false;
//            }
//        }
//        return true;


        //03
//        if(s.length()!=t.length()){
//            return false;
//        }
//        HashMap<Character,Integer> map=new HashMap<>();
//        for (char c : s.toCharArray()) {
//            int count=map.getOrDefault(c,0)+1;
//            map.put(c,count);
//        }
//        for (char m : t.toCharArray()) {
//            int count=map.getOrDefault(m,0);
//            if(count>0){
//                map.put(m,count-1);
//            }else {
//                return false;
//            }
//        }
//
//        return true;
        //01
//        HashMap<Character,Integer> map=new HashMap<>();
//        for (char c : s.toCharArray()) {
//            int count=map.getOrDefault(c,0)+1;
//            map.put(c,count);
//        }
//        for (char m : t.toCharArray()) {
//            int count=map.getOrDefault(m,0);
//            if(count>0){
//                map.put(m,count-1);
//            }else {
//                return false;
//            }
//        }
//        for (char c : s.toCharArray()) {
//            if(map.get(c)>0){
//                return false;
//            }
//        }
//        return true;
        //02
//        if(s.length()!=t.length()){
//            return false;
//        }
//        char[] array=s.toCharArray();
//        Arrays.sort(array);
//
//        char[] array2=t.toCharArray();
//        Arrays.sort(array2);
//
//        return Arrays.equals(array,array2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
