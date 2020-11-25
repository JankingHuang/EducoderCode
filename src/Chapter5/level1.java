package Chapter5;

public class level1 {
    public static void main(String[] args) {
        ForPractice1 forPractice1 = new ForPractice1();
        forPractice1.test();
    }

    public static class ForPractice1 {
        public static void test() {
            /*****start*****/
            for (int i = 0; i < 10; ++i) {
                for (int j = 10; j > 0; --j) {
                    System.out.print("*");
                }
                System.out.println("");
            }


            /*****end*****/
        }
    }

}
