package com;
/*
 Create 2017.7.22
  单例设计一： 解决一个类在内存中只存在一个对象。保证对象在内存中存在的唯一性。
  用类名或对象访问方法
  代码体现：
1.	将构造函数私有化
2.	在类中创建一个本类对象
3.	提供一个方法可以获取该对象
饿汉式：Single类一进内存，就已经创建好了对象
开发一般用饿汉式 安全
 */
public class SingleDemo {
    public  static void main(String[]args){
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(20);
        System.out.println(s2.getNum());
    }
}
class Single{
    private int num;
    public void setNum(int num){
        this.num = num ;
    }
    public int getNum(){
        return num;
    }
    private Single(){};
    private static Single s= new Single();
    public  static Single getInstance() {
        return s;
    }
}
/*
单例设计写法二
 */
//对象被调用时，才初始化，也叫做对象的延时加载  懒汉式
//Single类进内存，对象还没有存在，只有调用getInstance方法是，才建立对象
/*class Single{
    private static Single s = null;
    private  Single(){};
   public  static  Single getInstance(){
        if (s==null)
            s = new Single();
        return s;
   }
}*/