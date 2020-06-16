package _02MethodsAndArray;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        /**
         * 从键盘中任意输入一个数字，判断是否在数组中
         * */
        int [] arr = {10,20,30,22,43,37,2};
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        boolean flag = false;
        for (int item:arr) {
            if(userInput==item){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("猜测是正确的");
        }else{
            System.out.println("猜测不正确");
        }
    /**
     * 随机数猜测
     * */
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
        RandomNumber(userInput);
        char [] cs = {'a','b','c','d','e','f','g'};
        printTrangle(cs);
    }
    public static void RandomNumber(int x){
        int [] nums = new int[5];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
            System.out.print(nums[i]);
        }
        boolean flag = false;
        for (int j=0;j<nums.length;j++){
            if(nums[j]==x){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("你猜对了");
        }else {
            System.out.println("你猜错了");
        }
    }

    public static  void printTrangle(char[] cs){
        int length = cs.length;
            for (int i = 1; i <= length; i++) {
                for (int j = i; j < length ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print(cs[i-1]);
                }
                System.out.println();
            }
    }
}
