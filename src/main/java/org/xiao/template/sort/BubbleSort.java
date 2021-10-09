package org.xiao.template.sort;

import org.junit.Test;
import org.xiao.template.common.Utils;

import java.util.Arrays;

public class BubbleSort {
    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        bubbleSort(test);
        System.out.println(Arrays.toString(test));
    }

    void bubbleSort(int[] array){
        for (int i = array.length; i > 0; i--){
            for (int j = 1; j < i; j++){
                if (array[j - 1] > array[j]){
                    Utils.swap(array,j-1,j);
                }
            }
        }
    }
}
