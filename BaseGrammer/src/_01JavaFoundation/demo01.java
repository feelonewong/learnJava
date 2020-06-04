package _01JavaFoundation;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
//        char c1 = 97;
//        char c2 = 'a';
//        System.out.println(c1 == c2);
//
//        long l = 10L;
//        int i = (int) l;
//        System.out.println(i);
//
//        int a = 1;
//        int b = 2;
//        int c = a + b;
//        System.out.println(c);
//
//        int d = 10;
//        int e = 3;
//        System.out.println("d/e="+d/e);
//        System.out.println("d%e="+d%e);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int x1 = scanner.nextInt();
//        System.out.println(x1);
//
//        System.out.println("请输入一个字符串");
//        String s2 = scanner.next();
//        System.out.println(s2);
//            *
//            **
//        多重循环打印
//        System.out.println("多重循环打印一:");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //打印99乘法表
        System.out.println("99乘法表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
        System.out.println("多重循环打印3:等腰三角形");
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("多重循环打印4");
        for (int i = 1; i <= 5; i++) {
            //内循环
            for (int j = 5; j > 0; j--) {
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
