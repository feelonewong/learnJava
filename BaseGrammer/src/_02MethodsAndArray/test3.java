package _02MethodsAndArray;

public class test3 {
    public static void main(String[] args) {
        /**
         * 求数列中的最大值和最小值
         * */
        int [] arr = {10,70,30,40,50};
         Max(arr);
         Min(arr);
    }
    public static void Max(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                int temp = 0;
                temp = arr[i];
                arr[i] = max;
                max = temp;
            }
        }
        System.out.println("max: "+max);
    }
    public static void Min(int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                int temp = 0;
                temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        System.out.println("min: "+min);
    }
}
