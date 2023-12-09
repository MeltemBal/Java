package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {

    public static void main(String[] args) {

    int[][] arr= {{3,4,5},{9,10},{7}, {1,2,3,4,5,6}};

        System.out.println(Arrays.toString(arr[0])); //[3, 4, 5]

        System.out.println(arr[3][3]); //4

        System.out.println(Arrays.toString(arr[2])); //[7]

        System.out.println(arr[2][0]); //7

        // 10 elementinin yerine deger olarak 5 atayın

        arr[1][1]=5;

        // 6 elementinin yerine deger olarak 8 atayın

        arr[3][5]=8;

        // tüm arrayi yazdırın
        System.out.println(Arrays.deepToString(arr));
        // [[3, 4, 5], [9, 5], [7], [1, 2, 3, 4, 5, 8]]

        // 1 indexdeki inner array'in 1. indexteki elementinin degerini
        // dinamik olarak 3 artırın

        arr[1][1] +=3;
        System.out.println(Arrays.deepToString(arr));
        // [[3, 4, 5], [9, 8], [7], [1, 2, 3, 4, 5, 8]]




    }
}
