package Chapter2;

import java.util.Scanner;

public class level7 {
    public static void main(String[] args) {
        People  people = new People();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入嫦娥的个人信息：");

        System.out.println("请输入姓名：");
        people.setName(scanner.next());

        System.out.println("请输入年龄：");
        people.setAge(scanner.nextInt());

        System.out.println("请输入性别：");
        people.setSex(scanner.next());

        System.out.println("请输入体重：");
        people.setWeight(scanner.nextFloat());

        System.out.println("请输入地址：");
        people.setAdress(scanner.next());

        System.out.println("请输入是否已婚：");
        people.setStatus(scanner.next());

        System.out.println(people);

    }

    static private class People {
        private String name;
        private int age;
        private String sex;
        private float weight;
        private String adress;
        private String status;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "信息如下：" +
                    "\n\t姓名： " + name  +
                    "\n\t年龄： " + age + "岁"+
                    "\n\t性别： " + sex +
                    "\n\t体重： " + weight + "Kg"+
                    "\n\t地址： " + adress +
                    "\n\t婚否： " + status ;
        }
    }
}
