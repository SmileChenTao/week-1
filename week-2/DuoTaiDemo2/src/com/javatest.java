package com;
/*
 Create 2017.7.23
 在多态
 （非静态）成员函数的特点：成员函数在多态调用时，编译看左边，运行看右边
 静态成员函数的特点：无论编译和运行，都参考左边
 数据成员的特点：在多态中，成员变量的特点：无论编译还是运行，都参考左边（引用型变量所属的类）

 Student bs = new BaseStudent();
 */
abstract class Student{
    public abstract void study();//不同学生学习方式不同，用抽象类
    public void sleep(){
        System.out.println("躺");
    }
}
class Dostudent{
    public void doSomething(Student stu){
        stu.sleep();
        stu.study();
    }
}
class BaseStudent extends Student{
    public void study(){
        System.out.println("Base Study");
    }
    public void sleep(){
        System.out.println("坐");
    }
}
class AdvStudent extends Student{
    public  void study(){
        System.out.println("Adv Study");
    }
}

public class javatest {
    public static void main(String[]args){
       // BaseStudent bs = new BaseStudent();
       //  bs.study();
       // bs.sleep();
        Dostudent ds = new Dostudent();
        ds.doSomething(new BaseStudent());
        ds.doSomething(new AdvStudent());
    }

}
