package com.javatest;
/*
 Create 2017.7.23
 多态：可以理解为事物存在的多种体现形态
 提高代码复用性,扩展性
 1.多态的体现
 父类的引用指向了（接收）自己的子类对象
 2.多态的前提
 必须是类与类之间的关系，要么继承，要么实现
 通常还有一个前提：存在覆盖
 3.多态的好处
 多态的出现大大的提高程序的扩展性
 4.多态的弊端
 提高扩展性，但是只能使用父类的引用访问父类中的成员
 5.多态的应用
 6.多态的出现代码中的特点
 */
/*
 动物
 猫，狗
 */
abstract class  Animal{
    public abstract void eat();
    public void Breath(){
        System.out.println("Breath");
    }
}
class  Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void Breath() {
        super.Breath();
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal{
    public  void eat(){
        System.out.println("吃骨头");
    }
    public void Breath() {
        super.Breath();
    }
    public void SeeHome(){
        System.out.println("看家");
    }
}
public class DuoTaiDemo {
  public static void main(String []args){
      /*Cat c = new Cat();
      c.eat();
      c.Breath();*/
      Animal a = new Cat();//类型提升。向上转型
      a.Breath();
      a.eat();
      //a.catchMouse(); 错误，只能使用父类的方法
      //如果想要调用猫的特有方法时，如何操作？
      //强制将父类的引用。转成子类类型
      //千万不能将父类对象转成子类类型
      //父类引用指向自己的子类对象时，该应用可以被提升，也可以被强制转换
      //多态自始自终都是子类对象在做变化
      function(new Dog());
      Cat C = (Cat)a;
      C.catchMouse();
  }
   public static  void function(Animal a){
      a.eat();
      if(a instanceof Cat ) {  // a指向对象是Cat类型对象
          Cat cat = (Cat)a;
          cat.catchMouse();
      }else if(a instanceof Dog){
          Dog dog = (Dog) a;
          dog.SeeHome();
      }
   }
 }
