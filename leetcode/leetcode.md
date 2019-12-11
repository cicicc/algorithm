# leetcode 练习题目汇总

## 

### 只出现一次的数字
题目描述：
    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
    
    说明：
    
    你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
    
    示例 1:
    
    输入: [2,2,1]
    输出: 1
    示例 2:
    
    输入: [4,1,2,1,2]
    输出: 4
 
提示：
    使用异或方法解决 
    `如果a == b,a^b = 0`
代码
```java
    public class NumberOnlyAppearOnce {
    
        public static int singleNumber(int[] nums) {
            if(nums == null || nums.length == 0){
                return -1;
            }
            if(nums.length == 1){
                return nums[0];
            }
            int result = 0;
            for(int i = 0; i < nums.length; i++){
                result = result^nums[i];
            }
    
            return result;
        }
    
    }
```
        
        
  
### 求众数
题目描述：
    给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    
    你可以假设数组是非空的，并且给定的数组总是存在众数。
    
    示例 1:
    
    输入: [3,2,3]
    输出: 3
    示例 2:
    
    输入: [2,2,1,1,1,2,2]
    输出: 2   
提示
    使用额外空间存储每个元素出现的次数      
    
```java
    public class MajorityElement {
    
    
        public static int majorityElement(int[] nums) {
            if(nums == null || nums.length == 0){
                return -1;
            }
            if(nums.length == 1){
                return nums[0];
            }
            Map<Integer,Integer> tempMap  = new HashMap<>();
            //使用hash map来存储数据和判断数据是否已经存在
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
```           