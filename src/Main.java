import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
        Double kilometre , tutar, toplamTutar ;
        System.out.print("Kaç Kilometre Gidildi = ");
        kilometre = km.nextDouble();
        toplamTutar = (kilometre * 2.2) ;
        tutar = toplamTutar < 20.0 ? 20 : toplamTutar ;

        System.out.println(kilometre + " km gitiniz");
        System.out.println(tutar + " ödeme yapmalısınız");

    }
}