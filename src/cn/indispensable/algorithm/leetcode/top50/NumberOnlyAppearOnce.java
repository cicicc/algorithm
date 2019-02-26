package cn.indispensable.algorithm.leetcode.top50;

/**
 * @Description 只出现一次的数字 使用异或来解决问题 如果a==b,那么a^b=0
 * @Author: HaiBo Chen
 * @Date: 2019-02-26
 * @Time: 20:41
 */
public class NumberOnlyAppearOnce {

    public static int singleNumber(int[] nums) {
        if(nums==null || nums.length == 0){
            return -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        int result = 0;
        for(int i =0;i<nums.length;i++){
            result=result^nums[i];
        }

        return result;
    }

}
