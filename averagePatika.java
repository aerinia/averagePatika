import java.util.Scanner;
public class averagePatika{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = scan.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        int tarih= scan.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = scan.nextInt();
        double sonuc=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        scan.close();
        System.out.println("Ortalamanız"+ " "+sonuc+".");

        System.out.println(sonuc>60? "Sınıfı geçtiniz." : "Sınıfta kaldınız");
    }
}
