package com.bertram.java_learn.算法;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author wang
 * @date 2020/9/1 17:19
 */
public class Solution {
    List<Integer> psum = new ArrayList<>();
    int tot = 0;
    Random rand = new Random();

    public Solution(int[] w) {
        for (int x : w) {
            this.tot += x;
            this.psum.add(this.tot);
        }
    }

    public int pickIndex() {
        int targ = this.rand.nextInt(this.tot);

        int lo = 0;
        int hi = this.psum.size() - 1;
        while (lo != hi) {
            int mid = (lo + hi) / 2;
            if (targ >= this.psum.get(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};

        Solution solution = new Solution(arr);
        HashMap<Integer, Integer> map = Maps.newHashMapWithExpectedSize(10);
        for (int i = 0; i < 100; i++) {
            int i1 = solution.pickIndex();
            System.out.println();
            if (map.get(i1) != null) {
                map.put(i1, map.get(i1) + 1);
            } else {
                map.put(i1, 1);
            }
        }
        System.out.println(map);

    }
}
