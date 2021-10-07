package org.xiao.template.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort {

    static int[] helper;

    @Test
    public void test(){
        int[] test = new int[]{1,5,67,3,2,80,2,10};
        helper = new int[test.length];
        mergeSort(test,0,test.length - 1);
        System.out.println(Arrays.toString(test));
    }

    void mergeSort(int[] array, int left, int right){
        if (left < right){
            int mid = left + right >> 1;
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }

    void merge(int[] array, int left, int mid, int right){
        System.arraycopy(array,left,helper,left,right - left + 1);
        int p1 = left;
        int p2 = mid + 1;
        int pos = left;
        while (p1 <= mid && p2 <= right){
            if (helper[p1] <= helper[p2]){
                array[pos++] = helper[p1++];
            } else {
                array[pos++] = helper[p2++];
            }
        }

        while (p1 <= mid){
            array[pos++] = helper[p1++];
        }

        while (p2 <= mid){
            array[pos++] = helper[p2++];
        }

    }

}
