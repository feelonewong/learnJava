package _02MethodsAndArray;

import java.util.Random;
import java.util.Scanner;
/**
 * 随机生成5个数字进行猜测
 * */
public class ArrayExcrise2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("请输入你要猜测的数字: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        Boolean flag = false;
        for (int x:nums) {
            if(userInput == x ){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("恭喜你猜对了");
        }else{
            System.out.println("很抱歉你猜错了");
        }
    }
}
