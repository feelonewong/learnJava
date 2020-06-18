package _02MethodsAndArray;


public class test4 {
    public static void main(String[] args) {
        int[] arr = {20, 19, 38, 109, 288};
        int[] temp = bubbleSort(arr);
//        for (int item : temp) {
//            System.out.println(item);
//        }
        for (int item : selectSort(arr)) {
            System.out.println(item);
        }
    }
    /*冒泡排序*/

    /**
     * 相同得元素得前后顺序并没有改变，所以冒泡排序是一种稳定得排序算法
     */
    public static int[] bubbleSort(int[] array) {
        /*外层循环轮数length-1 */
        for (int i = 0; i < array.length - 1; i++) {
            /*内层循环比较数 length-1-i */
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    /*交换位置*/
                    array[j] = array[j] + array[j + 1];
                    array[j + 1] = array[j] - array[j + 1];
                    array[j] = array[j] - array[j + 1];
                }
            }
        }
        return array;
    }

    /*选择排序*/
    /**
     * 不稳定得排序，每一次从选出最小得元素，交换他们得下标
     */
    public static int[] selectSort(int[] array) {
        int minIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            /*每轮假设最小值是当前得下标*/
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                /*从当前比较得下一个开始进行比较*/
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            /*如果不是当前轮数是最小值下标就进行交换*/
            if (minIndex != i) {
                array[minIndex] = array[i] + array[minIndex];
                array[i] = array[minIndex] - array[i];
                array[minIndex] = array[minIndex] - array[i];
            }
        }
        return array;
        /**第一轮假设是34最小,交换以后34第二
         * 34(m) 4 56 17 90 65  //原始数据
         * 4 34(m)  56 17 90 65  1轮 5次
         * 4 17 56(m) 34 90 65  2轮 4次
         *
         *
         * **/
    }
}
