package javamanual;



import java.util.Scanner;

/**
 * Created by 95140 on 2017/7/9.
 */
public class IfStarementDemo {
    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        if(a>0){
            System.out.println("正整数");
        }
        else if(a<0){
            System.out.println("负整数");
        }else{
            System.out.println("零");
        }
    }
}
