package day13_forLoop;

public class C02_ForLoop {
    public static void main(String[] args) {

        //60 ve 23 dahil olmak üzere
        //7 ile bölünebilen sayıları 60'dan geriye dogru yazdırın

        for (int i=60; i>=23 ; i--) {


            if(i% 7 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        // 3 basamaklı pozitif tamsayıları toplayıp sonucu yazdırın

        int toplam=0;
        for(int i=100; i<1000; i++){

            toplam +=i;
        }

        System.out.println("Sayilarin toplami:"+ + toplam);

        // -1000 ile +1000 arasındaki tum tamsayıları toplayın

        toplam=0;
        for (int i=-1000; i<=1000; i++){

            toplam+=i;
        }

        System.out.println("-1000 ve 1000 arasındaki sayıların toplamı"+ toplam);
    }
}
