package com.javatest;
/*
 * Created by 95140 on 2017/7/22.
 * 猜数字2
 */

import java.util.Random;
import java.util.Scanner;

public class GusseNumber2 {
    public static void main(String[] args) {
        System.out.println("1 开始游戏");
        System.out.println("2 退出游戏");
        System.out.println("3 再来一次");
        while (true) {
            Scanner q = new Scanner(System.in);
            int begin = q.nextInt();
            if (1 == begin || 3 == begin) {
                Game game = new Game();
            }
            else
            if(begin==2)
            {
                System.exit(1);
            }
            else
            if(begin==3)
            {
                continue;
            }
        }
    }
}
class Game {
    Game() {
        System.out.println("猜数字游戏");
        System.out.println("请输入数字");
        int record = 1;
        Random random = new Random();
        int randomnumber = random.nextInt(100);
        System.out.println(randomnumber);
        while (true) {
            Scanner s = new Scanner(System.in);
            int input = s.nextInt();

            if (randomnumber < input) {
                System.out.println("大");
            }
            if (randomnumber > input) {
                System.out.println("小");
            }
            if (randomnumber == input) {
                break;
            } else {
                record++;
                System.out.println("重新输入");
            }
        }
        System.out.println("你猜了" + record + "次");
    }
}