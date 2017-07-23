package com.javatest;
/*
 Create 2017.7.23
 基本功能在类中，扩展功能在接口中
 */
abstract class Student {
    abstract void study();
    void sleep(){
        System.out.println("sleep");
    }
}
interface Smoking{
  public abstract   void smoke();
}
class Zhang extends Student implements Smoking{
    void study(){}
    public void smoke(){}
}

public class InterfaceTest {
   public static void main(String[]args){
       System.out.println("sss");
   }
}
