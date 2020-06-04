package _02MethodsAndArray;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        System.out.println("This is Chaprte2 Obejct-Oriented");
       // getMenu();
        /**
         * 1.传入参数打印直接三角形
         * 2.判断是否是瑞年
         * */
        Scanner scanner = new Scanner(System.in);
        printTriangle(scanner.nextInt());
        System.out.println("请输入你要查询得年份:");
        String result = isLeapYear(scanner.nextInt());
        System.out.println(result);
    }
    public static void getMenu(){
        System.out.println("葱花炒鸡蛋");
        System.out.println("西红柿炒鸡蛋");
        System.out.println("青椒炒鸡蛋");
        System.out.println("韭菜炒鸡蛋");
    }
    public static void printTriangle(int line){
        for(int i=0; i<=line;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static String isLeapYear(int year){
        Boolean year1 = year%4 == 0;
        Boolean year2 = year%100 != 0;
        Boolean year3 = year%400 == 0;

        if(year1&&year2||year3){
            return "是闰年";
        }else {
            return "是平年";
        }
    }
}
