package com.javatest;

import java.util.Arrays;

/**
 * Created by 95140 on 2017/7/19.
 * 折半查找可以提高效率，但数组必须是有序的
 * 在数组中插入数字可以使用折半查找
 */
public class FoundNumber {
    /*public static int HalfFound(int[]arr,int key){
        int min,max,mid;
        min=0;
        max=arr.length-1;
        mid=(min+max)/2;
        while(key!=arr[mid]){
            if(key>arr[mid])
                min=mid+1;
            else if(key<arr[mid])
                max=mid-1;
           mid=(min+max)/2;
            if(min>max)
            return -1;
        }
     return mid;
    }*/
    public static int HalfFound_1(int []arr,int key){    //在数组中插入数字的位置
        int min,max,mid;
        min=0;
        max=arr.length-1;
        while(min<=max){
            mid=(max+min)/2;
            if(key>arr[mid])
                min = mid + 1;
            else if(key<arr[mid])
                max=mid - 1;
            else
                return mid;
        }
        return  min;
    }
    public static void main(String[]args){
        int []arr=new int[]{3,10,5,7,9,12};
        int []arr2= Arrays.copyOf(arr,arr.length);//数组复制
        Arrays.sort(arr);//数组排序
        System.out.println(Arrays.toString(arr));//数组输出
     // System.out.println(HalfFound(arr,20));
       System.out.println(HalfFound_1(arr,8));
    }
}
