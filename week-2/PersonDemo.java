package com.javatest;

/**
 * Created by 95140 on 2017/7/21.
 */
public class PersonDemo {
    public static void main(String[]args){
         Person s = new Person();
         Person s1 = new Person(10);
         Person s2 = new Person(20, "CB");
        s.setAge(20);
        System.out.println(s.getAge());
        s.setName("小白猪");
        System.out.println(s.getName());
    }
}
class Person{
    private int age;
    private String name;
   Person(){
       System.out.println("A: name = "+name+" , age = "+ age);
   }
   Person(int a){
       age = a;
       System.out.println("B: name = "+name+" , age = "+ age);
   }
   Person(int a,String n){
       age = a;
       name = n;
       System.out.println("C: name = "+name+" , age = "+ age);
   }
   void setAge(int a){
       age = a;
   }
   int getAge(){
       return age;
   }
   void setName(String n){
       name = n;
   }
   String  getName(){
       return name;
   }
}
