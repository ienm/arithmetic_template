package org.xiao.template.sort;

import org.junit.Test;
import org.xiao.template.common.Utils;

import java.util.Arrays;

public class HeapSort {
    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        heapSort(test);
        System.out.println(Arrays.toString(test));
    }

    //小根堆
    void heapSort(int[] array){
        buildHeap(array);
        int current = 0;
        int[] helper = Arrays.copyOf(array, array.length);
        for (int i = array.length - 1; i >= 0;) {
            Utils.swap(helper,0,i);
            array[current++] = helper[i];
            heapDown(helper,0,--i);
        }
    }

    void buildHeap(int[] array){
        for (int i = array.length/2 - 1; i >= 0; i--) {
            heapDown(array,i,array.length - 1);
        }
    }

    void heapDown(int[] array, int pos, int capacity){
        int l = pos*2 + 1;
        int r = pos*2 + 2;


        int min = l;

        if (l  > capacity){
            return;
        }

        if (r <= capacity){
            min = array[l] > array[r]? r: l;
        }

        if (array[pos] > array[min]){
            Utils.swap(array,pos,min);
            heapDown(array,min,capacity);
        }
    }
}
