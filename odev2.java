import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int array[]=new int[10];
System.out.println("10 adet sayı giriniz" );

for(int i=0;i<array.length;i++) array[i] = sc.nextInt();
for(int i=0;i<array.length;i++){
    for(int j=0;j<i;j++){
        if(array[i]==array[j]){
            System.out.println("tekrar edenler"+array[i] );

        }
    }
}

    }
}
