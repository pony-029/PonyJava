package compilerclass;

import java.util.Scanner;

public class BeautyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int cnt = count1Num(num);
        System.out.println("the 1 in num is : "+cnt);
    }

    /**
     * 根据除数是否定为0计算num中1的个数
     * @param num
     * @return
     */
    public static int count1Num(int num){
        int cnt = 0;
        while(num > 0){
            if(num %2 ==1){
                cnt++;
            }
            num = num/2;
        }
        return cnt;
    }

    /**
     * 使用位运算计算1的个数
     * @param num
     * @return
     */
    public static int count1WithBit(int num){
        int cnt = 0;
        while (num > 0){
            cnt += num&0x01;
            num >>=1;
        }
        return cnt;
    }
}
