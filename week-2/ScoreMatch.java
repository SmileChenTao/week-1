package JavaTest;

import java.util.Scanner;

/**
 * Created by 95140 on 2017/7/10.
 */
public class ScoreMatch {
    public static void main(String[] args){
        System.out.println("请输入成绩：");
        Scanner s=new Scanner(System.in);
        String level;
        int a=s.nextInt()/10  ;
        switch (a){
            case 10:
            case 9 : level="优秀"; break;
            case 8:level="良好";break;
            case 7: level="中等";break;
            case 6: level="及格";break;
            default: level="不及格";
        }
        System.out.println(level);
    }
}

