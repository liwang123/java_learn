package com.bertram.java_learn.算法;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang
 * @date 2019/7/29 17:44
 */
public class TwoNumsSum {
    /**
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/two-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(final String[] args) {
        final int[] nums = {2, 7, 11, 15};
        final int target = 9;
        final Map<Integer, Integer> map = new HashMap<>(10);
        for (int i = 0; i < nums.length; i++) {
            final int count = target - nums[i];
            if (map.containsKey(count)) {
                System.out.println(map.get(count) + "+" + i + "=" + target);
            }
            map.put(nums[i], i);
        }
    }

}
