package alg;

import java.util.Scanner;

public class StringAlg {
    /**
     * String 的典型处理代码
     */

    /**
     * 1、String() 创建一个空字符串
     * 2、length() 字符串的长度
     * 3、charAt(int i) 第i个字符
     * 4、indexOf(String p) p第一次出现的位置 (如果没有则返回-1)
     * 5、indexOf(String p,int i) p在i个字符后第一次出现的位置(如果没有则返回-1)
     * 6、concat(String t) 将t赋在该字符串末尾
     * 7、substring(int i,int j)该字符串的子字符串(第i个字符到底j-1个字符)
     * 8、split(String delim) 使用delim分割符切分字符串
     * 9、compareTo(String t) 比较字符串
     * 10、equals(String t) 该字符串的值和t的值是否相同
     * 11、hashCode() 散列值
     */

    public void  stringCommonAlg(String s,String args[],String [] a){
        /**
         * 判断字符串是否是回文字符串
         *
         */
        int N  = s.length();
        for(int i = 0 ; i< N/2;i++){
            if(s.charAt(i) != s.charAt(N-i-1)) {
//                return false;
            }
        }
//        return true;
        /**
         * 从一个命令行参数参数中提取文件名和后缀名
         */
        String s1 = args[0];
        int dot = s1.indexOf(".");
        String base = s1.substring(0,dot);
        String extention = s1.substring(dot+1,s1.length());

        /**
         * 已空白分割符从标准输入中创建一个字符串数组
         */

        String input = new Scanner(System.in).next();
        String [] words  = input.split("\\s+");

        /**
         * 检查一个字符串数组中的元素是否已经按照字母表顺序排列
         */
        for (int i =1;i < a.length;i++){
            if(a[i-1].compareTo(a[i]) < 0){
//                return false;
            }
        }
//        return ture;

    }


}
