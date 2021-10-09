package org.xiao.template.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        bucketSort(test,5);
        System.out.println(Arrays.toString(test));
    }

    void bucketSort(int[] array, int bucketSize) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int bucketNum = (max - min) / bucketSize + 1;

        List<ArrayList<Integer>> bucketArray = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < bucketNum; i++) {
            bucketArray.add(new ArrayList<Integer>());
        }

        for (int i : array) {
            int index = (i - min) / bucketNum;
            bucketArray.get(index).add(i);
        }

        for (int i = 0; i < bucketArray.size(); i++) {
            Collections.sort(bucketArray.get(i));
        }

        int current = 0;
        for (ArrayList<Integer> arrayList : bucketArray) {
            for (Integer integer : arrayList) {
                array[current++] = integer;
            }
        }
    }
}
