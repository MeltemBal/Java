package day22_multiDimensionalArrays_ArrayLists;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

//  Soru 2- Verilen 2 katli bir array’de
        //  ayni index’e sahip elementleri toplayip,
        //  yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //  input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
        //  output:                      [5, 7, 11]

        // output array'i kisa inner array'in uzunluguna eşit olacak
        // inner array sayısını d,nam,k olacak sekilde düsünelim

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7, 8}};

        // output'un uzunlugu en kısa array'in uzunluguna eşit olacak
        // o zaman önce en kisa inner array'in uzunlugunu bulalım

        int enKisaInnerLength = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length< enKisaInnerLength){

                enKisaInnerLength=arr[i].length;


            }
        }

int[] output= new int[enKisaInnerLength];


        for (int i = 0; i < output.length ; i++) { // output'un içine konacak index

            for (int j = 0; j <arr.length ; j++) { // arr'deki her bir inner array'in elementini bulacak

                output[i] +=arr[j][i];

            }
        }

        System.out.println(Arrays.toString(output)); //[5, 7, 11]

    }
}
