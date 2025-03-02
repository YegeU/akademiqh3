import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class odev5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<String> liste=new ArrayList<>();
        System.out.println("10 keilme giriniz :");
        for (int i = 0; i <10;i++) {
            liste.add(sc.nextLine());
        }
        Collections.sort(liste);
        for (String duzen : liste) {
            System.out.println(duzen);
        }
    }
}
