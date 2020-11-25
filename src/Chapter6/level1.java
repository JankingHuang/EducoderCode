package Chapter6;

import static java.lang.Math.sqrt;

public class level1 {
    public static void main(String[] args) {
       for(int i = 2; i < 1000; i++)
        primNumber(i);
    }

    private static void primNumber(int m) {
        int k = (int) sqrt(m);
        int i = 2;
        for(; i <= k; ++i){
            if(m % i == 0)break;
        }
        if(i > k) System.out.println(m+"是");
//        else System.out.println(m+"否");
    }
}
