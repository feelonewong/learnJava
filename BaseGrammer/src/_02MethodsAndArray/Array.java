package _02MethodsAndArray;

public class Array {
    public static void main(String[] args) {

        /**
         * 数组声明的四种方式
         * */
        int[] scores = new int[4];

        int[] scores1;
        scores = new int[3];

        int[] score3 = new int[]{1, 2, 3, 45};
        for (int i = 0; i < score3.length; i++) {
            //    System.out.println(score3[i]);
        }

        int[] score4 = {12, 34, 56, 78, 89};
        for (int i = 0; i < score4.length; i++) {
            System.out.println(score4.length);
            System.out.println(score4[i]);
        }
        //数组遍历得方法1
        int[] score = {23, 47, 19, 58, 92};
        int len = score.length;
        for (int i = 0; i < len; i++) {
            System.out.println("score" + "[" + i + "]: " + score[i]);
        }
        //数组遍历得方法2
        for (int x : score) {
            System.out.println("x: " + x);
        }
        print(22, 33, 44, 13, 43, 134, 123);

        //ArrayError(null);
        ArrayLengthError(score);
    }

    public static void print(int... x) {
        System.out.println(x);
        int length = x.length;
        for (int i = 0; i < length; i++) {
            System.out.println("i: " + x[i]);
        }
    }

    public static void ArrayError(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static void ArrayLengthError(int[] x){
        System.out.println(x[10]);
    }
}
