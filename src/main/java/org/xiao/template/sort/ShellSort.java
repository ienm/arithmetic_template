package org.xiao.template.sort;

import org.junit.Test;

import java.util.Arrays;

public class ShellSort {

    @Test
    public void test() {
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        ShellSort(test);
        System.out.println(Arrays.toString(test));
    }

    void ShellSort(int[] array){
        for (int interval = array.length/2; interval > 0; interval--){
            for (int j = interval; j < array.length; j += interval){
                int index = j - interval;
                int target = array[j];
                while (index >= 0 && array[index] > target){
                    array[index + interval] = array[index];
                    index -= interval;
                }
                array[index + interval] = target;
            }
        }
    }
}
