package org.xiao.template.sort;

import org.junit.Test;

import java.util.Arrays;

public class InsertSort {

    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        insertSort(test);
        System.out.println(Arrays.toString(test));
    }

    void insertSort(int[] arrays){
        for (int i = 1; i < arrays.length; i++) {
            int target = arrays[i];
            int index = i - 1;
            while(index >= 0 && arrays[index] > target){
                arrays[index + 1] = arrays[index];
                index--;
            }
            arrays[index + 1] = target;
        }
    }
}
