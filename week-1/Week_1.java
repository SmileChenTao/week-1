package JavaTest;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by 95140 on 2017/7/10.
 */
public class Week_1 {
    public static void main(String []args){
        Random  r = new Random();
        Random  x = new Random();
        int sum=0;
        int sign,a,b=0;
        int score=0;
        System.out.println("0-100之间的加减法");
        for(int i=0;i<10;i++) {
            do {
                a = r.nextInt(100);
                b = r.nextInt(100);
                sign = x.nextInt(2) + 1;
                if (sign == 2) {
                    sum = a + b;
                } else if (sign == 1) {
                    sum = a - b;
                }
            } while (sum < 0 || sum > 100);
            if (sign == 2) {
                for (int l= 2; l >= 0; l--) {
                    System.out.print(a + "+" + b + "=");
                    Scanner s = new Scanner(System.in);
                    int sum2 = s.nextInt();
                    if (sum2 == sum) {
                        switch (l) {
                            case 2:
                                System.out.println("10分");score+=10;
                                break;
                            case 1:
                                System.out.println("9分");score+=9;
                                break;
                            case 0:
                                System.out.println("8分");score+=8;
                                break;
                            default:
                                System.out.println("0分");
                                break;
                        }
                        break;
                    }
                    else
                        System.out.println("你还有"+l+"次机会");
                }
            }
            if (sign == 1) {
                for (int k = 2; k >=0; k--) {
                    System.out.println(a + "-" + b + "=");
                    Scanner s = new Scanner(System.in);
                    int sum2 = s.nextInt();
                    if (sum2 == sum) {
                        switch (k) {
                            case 2:
                                System.out.println("10分");score+=10;
                                break;
                            case 1:
                                System.out.println("9分");score+=9;
                                break;
                            case 0:
                                System.out.println("8分");score+=8;
                                break;
                            default:
                                System.out.println("0分");
                                break;
                        }
                        break;
                    }
                    else
                        System.out.println("你还有"+k+"次机会");

                }
            }
        }
        System.out.println("你的成绩是"+score);
    }
}

