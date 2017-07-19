package com.javatest;

/**
 * Created by 95140 on 2017/7/18.
 * 最小值和最大值的获取
 */
public class GetMax {
    public static void main(String[]args){
        int[]arr={2,19,18,27};
        int[]arr2=new int[]{2,15,1,10,19,50};
        System.out.println("arr length ="+arr.length);
        System.out.println("arr2 length ="+arr2.length);
       System.out.println("arr max ="+Getmax(arr));
       System.out.println("arr2 min ="+Getmin(arr2));
    }
    public  static int Getmax(int []arr){
         int max=0;
         for(int i=0;i<arr.length;i++) {
             if (arr[i]>arr[max])
             {
                  arr[max]=arr[i];
             }

         }
         return arr[max];
    };
    public  static int Getmin(int []arr2){
        int min=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]<arr2[min]){
                arr2[min]=arr2[i];
            }
        }
        return arr2[min];
    }
}
