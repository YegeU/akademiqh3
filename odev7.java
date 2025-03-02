import java.util.ArrayList;
import java.util.Scanner;

public class odev7 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> liste=new ArrayList<>();
liste.add("ankara");
liste.add("izmir");
liste.add("bodrum");
liste.add("mardin");
liste.add("istanbul");
System.out.println("sehrinizi giriniz :");
int index;
String sehir = sc.nextLine();
if (liste.contains(sehir)) {
    index=liste.indexOf(sehir);
    System.out.println("sehriniz listede bulunmkata,indexi :"+index);
}
else {
    System.out.println("sehriniz listede yok");
}
    }
}
