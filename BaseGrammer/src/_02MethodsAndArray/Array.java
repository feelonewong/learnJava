package _02MethodsAndArray;

public class Array {
    public static void main(String[] args) {

        /**
         * 数组声明的四种方式
         * */
        int[] scores = new int[4];

        int [] scores1;
        scores = new int[3];

        int [] score3 = new int[]{1,2,3,45};
        for (int i = 0; i <score3.length ; i++) {
         //    System.out.println(score3[i]);
        }

        int [] score4 = {12,34,56,78,89};
        for (int i = 0; i <score4.length ; i++) {
            System.out.println(score4.length);
            System.out.println(score4[i]);

        }
    }
}
