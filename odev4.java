import java.util.*;

public class odev4 {



    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list=new ArrayList<>();
       System.out.println("Enter 10 numbers");
       for(int i=0;i<10;i++){
           list.add(sc.nextInt());

       }
        list.sort(Collections.reverseOrder());
        System.out.println("Sorted numbers: " + list);

    }
}
