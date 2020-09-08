package alg;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MySort {

    public static int findKthEle(int []nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
    public static int findKthEle2(int []nums,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);
            if(pq.size() > k){
                pq.poll();
            }
            return pq.peek();
        }
        return pq.peek();
    }
}
