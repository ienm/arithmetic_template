package org.xiao.template.sort;

import org.junit.Test;
import org.xiao.template.common.Utils;

import java.util.Arrays;

public class SelectionSort {
    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        select(test);
        System.out.println(Arrays.toString(test));
    }

    void select(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = index + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    Utils.swap(array,index,j);
                }
            }
        }
    }
}
