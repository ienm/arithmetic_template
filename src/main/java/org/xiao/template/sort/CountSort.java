package org.xiao.template.sort;

import org.junit.Test;

import java.util.Arrays;

public class CountSort {

    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        countSort(test);
        System.out.println(Arrays.toString(test));
    }

    void countSort(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        int[] helper = new int[max - min + 1];
        for (int i : array) {
            helper[i - min]++;
        }

        int current = 0;
        for (int i = 0; i < helper.length; i++) {
            while(helper[i]-- > 0){
                array[current++] = i + min;
            }
        }
    }
}
