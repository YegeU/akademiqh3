import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive=0;
        int negative=0;
        int array[]=new int[10];
        System.out.println("10 adet sayı giriniz");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();

        }
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                positive+=array[i];
            }
            if(array[i]<0){
                negative+=array[i];
            }
        }
        System.out.println("positifler"+positive);
        System.out.println("negatifler"+negative);
    }
}
