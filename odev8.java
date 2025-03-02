import java.util.ArrayList;
import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Integer> liste = new ArrayList<Integer>();
System.out.println("10sayı giriniz :");
for (int i = 0; i < 10; i++) {
    liste.add(sc.nextInt());
}
        int max=liste.get(0);
        int min=liste.get(1);
for (int i = 0; i < liste.size(); i++) {


    if (max<liste.get(i)) {
        max=liste.get(i);
    }
    if (min>liste.get(i)) {
        min=liste.get(i);
    }


    }
        System.out.println("en buyuk :"+max+"en kucuk : "+min);
    }
}

