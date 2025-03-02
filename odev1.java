import java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz(10)");
        int diziBoyut = sc.nextInt();
        int[] dizi = new int[diziBoyut];
        int toplam = 0;
        System.out.println("dizinin boyutu kadar sayı giriniz");

        for (int i = 0; i < dizi.length; ++i) {
            dizi[i] = sc.nextInt();
            toplam += dizi[i];
        }

        double diziOrt = (double) (toplam / dizi.length);
        System.out.println("dizinin ortalaması: " + diziOrt);

        for (int i = 0; i < dizi.length; ++i) {
            if (dizi[i] > 50) {
                System.out.println("50den buyuk olanlar" + dizi[i]);
            }
        }

    }

}
