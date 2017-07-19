package com.javatest;

import java.util.Arrays;

/**
 * Created by 95140 on 2017/7/18.
 * 选择排序和冒泡排序
 */
public class SelectSort {     //选择排序
    /*public static void selectSort(int []arr) {
        for(int x=0;x<arr.length-1;x++)
            for(int y=x+1;y<arr.length;y++){
              if(arr[x]>arr[y]) {
                  int temp=arr[x];
                  arr[x]=arr[y];
                  arr[y]=temp;
              }
            }
    }*/
    /*public static void bubblesort(int []arr){  //冒泡排序
        for(int x=0;x<arr.length-1;x++)
            for(int y=0;y<arr.length-x-1;y++)
                if(arr[y]> arr[y+1])
                {
                    int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;
                }
    }*/

    public static void main(String[]args){
         int []arr=new int[]{2,6,3,1,10,9};
       //  selectSort(arr);
      //  bubblesort(arr);
         /*for(int x=0;x<arr.length;x++)
             if(x!=arr.length-1)
             System.out.print(arr[x]+",");
         else
             System.out.println(arr[x]);*/
         System.out.println(Arrays.toString(arr));
         Arrays.sort(arr);//java开发中要排序使用该代码
         System.out.println(Arrays.toString(arr));
    }

}
