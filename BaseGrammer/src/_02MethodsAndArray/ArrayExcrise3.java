package _02MethodsAndArray;

public class ArrayExcrise3 {
    public static void main(String[] args) {
        /**
         * 打印一个正三角形
         * ABCDEFG
         * */
        char [] words = {'A','B','C','D','E','F','G'};
        int length = words.length;
        for (int i = 1; i <= length; i++) {
            for (int j = i; j < length ; j++) {
                System.out.print("-");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(words[i-1]);
            }
            System.out.println();
        }
    }
}
