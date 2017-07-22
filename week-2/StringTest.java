package com.javatest;
/*
  create 2017.7.22
  字符串连接、获取字符串长度 length()方法、字符串查找 indexOf()方法或lastindexOf()方法、获取指定索引位置的字符 charAt()方法、
  获取子字符串substring方法、字符串替换replace()、按字典顺序比较字符串compareTo()、字符串分割 split()方法
*/
public class StringTest {
    public static void main(String []args){
        String s = "I love ";
        String s1 = "Java";
        System.out.println(s);
        String s2 = s+" " +s1;//连接字符串
        System.out.println(s2);
        int long1 = s.length();
        int long2 = s1.length();
        System.out.println("字符串s的长度 "+long1);
        System.out.println("字符串s1的长度 "+long2);//获取字符串长度
        int size = s.indexOf("lo");
        System.out.println("查找的lo的索引位置 "+size);//字符串查找
        int size1 = s.lastIndexOf("v");
        System.out.println("查找的v的索引位置 "+size1);//字符串查找
        char mychar = s.charAt(2);
        System.out.println("字符串S中索引位置为2的字符 "+mychar);//获取指定索引位置的字符
        String sub = s.substring(3,5);
        System.out.println("字符串S中索引位置从3开始后的2个字符串 "+sub);//获取子字符串substring方法
        String sub1 = s.substring(3);
        System.out.println("字符串S中索引位置从3开始后的所有字符串 "+sub1);//获取子字符串substring方法
        String newstr = s.replace("o","s");
        System.out.println("o替换成S后的字符串 "+newstr);//字符串替换replace()
        String str = "a";
        String str1 = "b" ;
        System.out.println("比较字符串 "+str.compareTo(str1));//按字典顺序比较字符串compareTo()
        String st = "192.168.0.1";
        String []firstArray = st.split("\\.");//按照“.”进行分割，使用转义字符“\\.”
        String []SecondArray = st.split("\\.",2);//按照“.”2次进行分割，使用转义字符“\\.”
        //输出原st值
        System.out.println("st的原值 ["+st+"]");
        //输出全部分割结果
        System.out.println("全部分割结果");//字符串分割 split()方法
        for(String a: firstArray){
            System.out.print("["+a+"]");
        }
        System.out.println();
        //输出分割2次结果
        System.out.println("分割2次结果");//字符串分割 split()方法
        for(String a: SecondArray){
            System.out.print("["+a+"]");
        }
    }
}
