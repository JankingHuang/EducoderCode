package Chapter4;

import java.util.Scanner;

public class level5 {
    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.first();
        practice.second();
        practice.third();
    }
    public static class Practice {

        final static Scanner sc = new Scanner(System.in);	//创建扫描仪

        //第一题
        public void first(){
            System.out.println("请输入人数：");
            int input = sc.nextInt();		//获取输入的数据

            /*****start*****/
            if(input>10) System.out.println("打全场");
            else System.out.println("打半场");




            /*****end*****/
        }

        //第二题
        public void second(){
            System.out.println("请输入今天星期几：");
            int input = sc.nextInt();		//获取输入的数据
            String prefix = "今天吃";
            String suffix = "";
            /*****start*****/
                if(input == 1)
                    suffix = "米饭";
                else if(input == 2)
                    suffix = "牛排";
                else if(input == 3)
                    suffix = "鸡排";
                else
                    suffix = "红烧肉";

            System.out.println(prefix + suffix);



            /*****end*****/
        }

        //第三题
        public void third(){
            System.out.println("请输入今天星期几：");
            int input = sc.nextInt();		//获取输入的数据
            String prefix = "今天吃";
            String suffix = "";
            /*****start*****/

            switch (input){
                case 1:
                    suffix = "米饭";break;
                case 2:
                    suffix = "牛排";break;
                case 3:
                    suffix = "鸡排";break;
                default:
                    suffix = "红烧肉";
            }
            System.out.println(prefix + suffix);


            /*****end*****/
        }
    }

}
