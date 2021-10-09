package org.xiao.template.sort;

import org.junit.Assert;
import org.junit.Test;
import org.xiao.template.common.Utils;

import java.util.Arrays;

public class QuickSort {

    @Test
    public void test(){
        int[] test1 = new int[]{1,5,67,3,2,80,2,10};
        quicksort2(test1,0,test1.length - 1);
        System.out.println(Arrays.toString(test1));
        int[] test2 = new int[]{1,5,67,3,2,80,2,10};
        quicksort2(test2,0,test2.length - 1);
        System.out.println(Arrays.toString(test2));

    }

    void quicksort1(int[] array, int left, int right){
        if (left < right){
            int mid = partition1(array,left,right);
            quicksort1(array,left,mid - 1);
            quicksort1(array,mid + 1, right);
        }
    }

    void quicksort2(int[] array, int left, int right){
        if (left < right){
            int mid = partition2(array,left,right);
            quicksort2(array,left,mid - 1);
            quicksort2(array,mid + 1, right);
        }
    }

    int partition1(int[] array, int left, int right){
        int midValue = array[left];
        int l = left + 1;
        int r = right;
        while (l <= r){
            if (array[l] <= midValue){
                l++;
            } else {
                Utils.swap(array,l,r);
                r--;
            }
        }
        Utils.swap(array,left,r);
        return r;
    }

    int partition2(int[] array, int left, int right){
        int midValue = array[left];
        int l = left + 1;
        int r = right;

        while (l <= r){
            while (l <= r && array[l] <= midValue){
                l++;
            }

            while (l <= r && array[r] > midValue){
                r--;
            }

            if (l <= r){
                Utils.swap(array,l,r);
            }
        }
        Utils.swap(array,left,r);
        return r;
    }

}
