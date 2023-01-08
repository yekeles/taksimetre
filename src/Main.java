import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner km = new Scanner(System.in);
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