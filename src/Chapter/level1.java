package Chapter;

public class level1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * 定义三个整数x,y,z，将这三个整数由小到大排序并输出。
         * 例如定义 int x = 9; int y = 10; int z = 8;   -- > x的值改成8  y的值改成9 z的值改成10
         *
         * 实现思路：通过if语句对x y z 的值进行匹配，比如x大于y则x和y进行数据交换
         * */
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //获取平台分配的x的值
        int x = sc.nextInt();
        //获取平台分配的y的值
        int y = sc.nextInt();;
        //获取平台分配的z的值
        int z = sc.nextInt();;

        /**********begin**********/

        int[] array = new int[]{x,y,z};
        java.util.Arrays.sort(array);





        /**********end**********/
        System.out.print("x:"+array[0]+" y:"+array[1]+" z:"+array[2]);

    }
}
