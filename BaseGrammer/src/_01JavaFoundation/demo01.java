package _01JavaFoundation;
import java.util.Scanner;
public class demo01 {
    public static void main(String[] args) {
        char c1 = 97;
        char c2 = 'a';
        System.out.println(c1 == c2);

        long l = 10L;
        int i = (int) l;
        System.out.println(i);

        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);

        int d = 10;
        int e = 3;
        System.out.println("d/e="+d/e);
        System.out.println("d%e="+d%e);

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x1 = scanner.nextInt();
        System.out.println(x1);

        System.out.println("请输入一个字符串");
        String s2 = scanner.next();
        System.out.println(s2);

    }
}
