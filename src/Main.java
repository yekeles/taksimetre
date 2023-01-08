import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);

        // Başlangıç 10 tl ile başlayıp, km başına 2.2 tl ödeme alan taksimetre ödeme alan programdır.
        // istenilirse başlangıç ve km başına ücrette güncelleme yapılarak program
        // üzerinden fiyat güncellemesi yapılabilir.

        double kilometre , tutar, toplamTutar ;
        double ilktutar = 10.0 ;
        System.out.print("Gidilen yolu km cinsinden giriniz = ");
        kilometre = km.nextDouble();
        toplamTutar = (ilktutar +(kilometre * 2.2)) ;
        tutar = toplamTutar < 20.0 ? 20 : toplamTutar ;

        System.out.print(kilometre + " km gitiniz ve 20 Tl altında ücretlendirme sabittir. ");
        System.out.print(tutar + " ödeme yapmalısınız");

    }
}