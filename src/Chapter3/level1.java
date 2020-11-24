package Chapter3;

import java.util.Scanner;

public class level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int a = scanner.nextInt();

        System.out.println("请输入第二个整数");
        int b = scanner.nextInt();

        Calc calc = new Calc(a,b);
        System.out.println("两数相加的结果为：" + calc.add());
        System.out.println("两数相减的结果为：" + calc.sub());
        System.out.println("两数相乘的结果为：" + calc.mul());
        System.out.println("两数相除的结果为：" + calc.div());
        System.out.println("两数取余数的结果为：" + calc.mod());


    }

    static public class Calc{
        private int num1;
        private int num2;

        public Calc(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }


        public int add(){
            return num1 + num2;
        }

        public int sub(){
            return num1 - num2;
        }

        public int mul(){
            return num1 * num2;
        }

        public int div(){
            return num1 / num2;
        }

        public int mod(){
            return num1 % num2;
        }
    }
}
