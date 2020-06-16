package _02MethodsAndArray;

public class test2 {
    public static void main(String[] args) {
        int [][] score = {{10,20,30},{50,60,70},{30,40,50} };
        int scoreLength = score.length;
        for (int i = 0; i <scoreLength ; i++) {
            int itemLength = score[i].length;
            int sum = 0;
            for (int j = 0; j < itemLength; j++) {
                sum+=score[i][j];
            }
            int avg = sum/itemLength;
            System.out.println("第"+(i+1)+"平均成绩是:"+avg);

        }


    }
}
