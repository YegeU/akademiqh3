import java.util.ArrayList;
import java.util.Scanner;

public class odev6 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        ArrayList<Integer> liste = new ArrayList<Integer>();
        System.out.println("20 sayı giriniz ");
        for (int i = 0; i < 20; i++) {
            liste.add(sc.nextInt());
        }
        ArrayList<Integer> liste1 = new ArrayList<Integer>();
        for (int i = 0; i<liste.size();i++){
            if (liste.get(i) % 2 == 0 ){
                liste1.add(liste.get(i));
            }
        }
        System.out.println(liste1);
}
    }
