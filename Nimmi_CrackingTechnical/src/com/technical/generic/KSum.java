package com.technical.generic;
import java.util.*;
import java.util.List;

public class KSum {

    private int total_length;
    private int[] num;
 
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        this.num = num;
        this.total_length = num.length;
        return kSum(3, 0, 0);
    }
 
    private List<List<Integer>> kSum(int length, int target, int start_index) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (length == 0) {
            if (target == 0) {
                // if we find the target,
                // open an entry to store the whole path
                result.add(new LinkedList());
            }
            return result;
        }
        
        for (int i = start_index; i < total_length - length + 1; i++) {
            if ((i > start_index) && (num[i] == num[i - 1])) {
                continue;
            }
            for (List<Integer> partial_result : kSum(length - 1, target - num[i], i+1)){
                partial_result.add(0, num[i]);
                result.add(partial_result);
            }
        }
        return result;
    }

}
