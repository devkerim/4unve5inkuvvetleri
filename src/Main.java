import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        Scanner intscanner = new Scanner(System.in);
        System.out.print("Hangi sayıya kadar yazdırmak istersiniz: ");
        sayi = intscanner.nextInt();
        System.out.println("4'ün kuvvetleri: ");
        for (int i=4;i<sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("5'in Kuvvetleri: ");
        for(int j=5;j<sayi;j*=5){System.out.println(j);}

    }
}
