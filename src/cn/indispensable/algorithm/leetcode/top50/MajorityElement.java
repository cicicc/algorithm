package cn.indispensable.algorithm.leetcode.top50;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author: HaiBo Chen
 * @Date: 2019-02-27
 * @Time: 12:50
 */
public class MajorityElement {


    public static int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        Map<Integer,Integer> tempMap  = new HashMap<>();
        //使用hashmap来存储数据和判断数据是否已经存在
        for(int i = 0; i<nums.length;i++){
            if(tempMap.containsKey(nums[i])){
                Integer value = tempMap.get(nums[i]);
                value++;
                tempMap.put(nums[i], value);
                if(value > nums.length/2){
                    return nums[i];
                }
            }else{
                tempMap.put(nums[i],1);
            }
        }
        return -1;
    }
}
