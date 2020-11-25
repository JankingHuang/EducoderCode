package Chapter5;

import java.util.Scanner;

public class levle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 1000;
        test();

        System.out.println("欢迎使用中国人民银行ATM取款机");
        while (true) {
            System.out.println("输入取款金额：");
            int input = scanner.nextInt();
            if (money - input < 0) {
                System.out.println("目前余额：" + money + ",无法满足您的取款需求！");
//                System.out.println("输入取款金额");
            } else {
                System.out.println("剩余金额：" + (money -= input) + "，是否继续（'1'：结束，'2'：继续）：");
                input = scanner.nextInt();
                if (input == 1) {
                    System.out.println("取款结束！");
                    break;
                }
            }

        }
    }
    static void test(){
        int count = 0;
        int i =3;
        int j = 0;
        do{
            j = 1;
            while(j<3){
                count ++;
                j ++;
                System.out.println(count);
            }
            System.out.println("-----------");
            i--;
        }while(i>0);
        count += j;
        System.out.println(count);

    }
}
