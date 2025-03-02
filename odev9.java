import java.util.ArrayList;
import java.util.Scanner;

public class odev9 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> liste=new ArrayList<>();
liste.add("a");
liste.add("b");
liste.add("c");
liste.add("d");
liste.add("e");

String secim=liste.get(0);//ilk elemanı getirir
System.out.println(secim);

liste.set(0,"f");//a yerine f geçer

        liste.remove(4);//listeden e çıkartılır
        System.out.println(liste);

int size=liste.size();
System.out.println(size);//listenin boyutunu gösterir

        liste.clear();//liste sıfırlanır
        System.out.println(liste);
    }
}
