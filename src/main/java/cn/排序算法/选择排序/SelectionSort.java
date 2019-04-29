package cn.排序算法.选择排序;

import org.junit.Test;

public class SelectionSort {
    @Test
    public void test() {
        int[] arr = {1,3,2,45,65,33,12 };
        System.out.println("交换之前");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        //选择排序的优化
        for (int i = 0; i < arr.length - 1 ; i++) {
            //假设最小值是k=i;
            int k = i;
            for (int j = k + 1; j < arr.length ; j++) {
                if (arr[j] < arr[k]) {
                    //找到最小值的位置
                    k = j;
                }
            }



        }

        System.out.println();
        System.out.println("交换后：");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
