//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。 
//
// 
//
// 示例 1： 
//
// 输入：s = "We are happy."
//输出："We%20are%20happy." 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 10000 
// 👍 48 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String replaceSpace(String s) {
        StringBuffer str=new StringBuffer();
        char[] array=s.toCharArray();
        if(array.length==0){
            return s;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]==' '){
                str.append("%20");
            }else {
                str.append(array[i]);
            }
        }

        return str.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
