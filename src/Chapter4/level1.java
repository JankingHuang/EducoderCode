package Chapter4;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学员成绩：");
        if(input.nextInt() >= 85){
            System.out.println("优,非常棒！");
        }else{
            System.out.println("良，下次加油！");
        }
    }
}
