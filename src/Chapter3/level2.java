package Chapter3;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        double a = scanner.nextInt();

        System.out.println("请输入第二个数字：");
        double b = scanner.nextInt();

        Calc calc = new Calc(a,b);
        System.out.println("a==b=" + calc.equal());
        System.out.println("a!=b=" + calc.notEqual());
        System.out.println("a>b=" + calc.more());
        System.out.println("a<b=" + calc.less());
        System.out.println("b>=a=" + calc.moreEqual());
        System.out.println("b<=a=" + calc.lessEqual());


    }

    static public class Calc{
        private double num1;
        private double num2;

        public Calc(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }


        public boolean equal(){
            return num1 == num2;
        }

        public boolean notEqual(){
            return num1 != num2;
        }

        public boolean more(){
            return num1 > num2;
        }

        public boolean less(){
            return num1 < num2;
        }

        public boolean moreEqual(){
            return num2 >= num1;
        }
        public boolean lessEqual(){
            return num2 <= num1;
        }
    }
}
