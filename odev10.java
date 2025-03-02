import java.util.Arrays;
import java.util.Scanner;

public class odev10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dizi = {1, 2, 3, 5, 8};
        int indeks = Arrays.binarySearch(dizi, 5);//5in indexini verir
        System.out.println(indeks); //=3

        Arrays.sort(dizi); // diziyi sıralar
        System.out.println(Arrays.toString(dizi));


        int[] kopya = Arrays.copyOfRange(dizi, 0, 2); // 0. indexten 2. indexe kadar kopyalar
        System.out.println(Arrays.toString(kopya));

        int[] dizi1 = {1, 2, 3, 5, 8};
        int[] dizi2 = {0, 2, 4, 5, 7};
        boolean equals = Arrays.equals(dizi1, dizi);//dizilerin eşit olup olmadığını kontrol eder
        System.out.println(equals);
        boolean equals1 = Arrays.equals(dizi2, dizi);
        System.out.println(equals1);

        int dizi3[] = new int[3];
        Arrays.fill(dizi, 5); // tüm elemanları 5 ile doldurur
        System.out.println(Arrays.toString(dizi)); // [5, 5, 5]
    }
}
