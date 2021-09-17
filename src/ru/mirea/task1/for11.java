package ru.mirea.task1;


public class for11{

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4};
        int sum = 0;
        int x = 0;
        do {
            sum += myArr[x];
            x++;
        }
        while (x < myArr.length);
        System.out.println( sum );


        while (x < myArr.length) {
            sum += myArr[x];
            x++;
        }
        System.out.println(sum);

        sum = 0;
        for (x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
