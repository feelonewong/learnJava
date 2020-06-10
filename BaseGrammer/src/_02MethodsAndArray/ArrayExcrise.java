package _02MethodsAndArray;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ArrayExcrise {
    public static void main(String[] args) {
        /**
         * 猜数游戏，从键盘任意输入一个数字，判断是否在数组中
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字(0-50)");
        int userInput = scanner.nextInt();
        int[] nums = new int[]{20, 23, 13, 42, 10, 5};
        Boolean flag = false;
        for (int x :nums) {
            if(userInput==x){
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("恭喜你猜对了");
        } else {
            System.out.println("很抱歉你没有猜对");
        }

    }
}
