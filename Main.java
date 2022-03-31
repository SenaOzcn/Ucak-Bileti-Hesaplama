import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      double mesafeMaliyeti, normalTutar, yasIndirimiCocuk, yasIndirimiGenc, yasIndirimiYasli, yasIndirimMaliyeti, gidisGonusBiletIndirimi, toplamTutar;
      int mesafe, yas, select;

      Scanner input = new Scanner(System.in);

      mesafeMaliyeti = 0.1;
      yasIndirimiCocuk = 0.5;
      yasIndirimiGenc = 0.1;
      yasIndirimiYasli = 0.3;
      gidisGonusBiletIndirimi = 0.2;

      System.out.println("Lütfen Uçuş Mesafesini Giriniz: ");
      mesafe = input.nextInt();
      
      if (mesafe >= 0) {
        normalTutar = mesafe * mesafeMaliyeti;
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();
        if ((yas >= 0) && (yas <= 12)) {
          yasIndirimMaliyeti = normalTutar - (normalTutar * yasIndirimiCocuk);
          System.out.println("Lütfen Yolculuk Tipini Seçiniz: ");
          System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
          select = input.nextInt();
          if (select == 1) {
            toplamTutar = yasIndirimMaliyeti;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else if (select == 2) {
            toplamTutar = (yasIndirimMaliyeti - (yasIndirimMaliyeti * gidisGonusBiletIndirimi)) * 2;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else {
            System.out.println("Geçersiz bir numara girdiniz. Lütfen tekrar deneyin.");
          }
        } else if ((yas >= 13) && (yas <= 24)) {
          yasIndirimMaliyeti = normalTutar - (normalTutar * yasIndirimiGenc);
          System.out.println("Lütfen Yolculuk Tipini Seçiniz: ");
          System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
          select = input.nextInt();
          if (select == 1) {
            toplamTutar = yasIndirimMaliyeti;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else if (select == 2) {
            toplamTutar = (yasIndirimMaliyeti - (yasIndirimMaliyeti * gidisGonusBiletIndirimi)) * 2;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else {
            System.out.println("Geçersiz bir numara girdiniz. Lütfen tekrar deneyin.");
          }
        } else if ((yas >= 25) && (yas <= 64)) {
          System.out.println("Lütfen Yolculuk Tipini Seçiniz: ");
          System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
          select = input.nextInt();
          if (select == 1) {
            toplamTutar = normalTutar;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else if (select == 2) {
            toplamTutar = (normalTutar - (normalTutar * gidisGonusBiletIndirimi)) * 2;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else {
            System.out.println("Geçersiz bir numara girdiniz. Lütfen tekrar deneyin.");
          }
        } else if ((yas > 64) && (yas < 128)) {
          yasIndirimMaliyeti = normalTutar - (normalTutar * yasIndirimiYasli);
          System.out.println("Lütfen Yolculuk Tipini Seçiniz: ");
          System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
          select = input.nextInt();
          if (select == 1) {
            toplamTutar = yasIndirimMaliyeti;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else if (select == 2) {
            toplamTutar = (yasIndirimMaliyeti - (yasIndirimMaliyeti * gidisGonusBiletIndirimi)) * 2;
            System.out.println("Toplam Ödemeniz Gereken Tutar: " + toplamTutar + " TL'dir.");
          } else {
            System.out.println("Geçersiz bir numara girdiniz. Lütfen tekrar deneyin.");
          }
        } else {
          System.out.println("Geçersiz bir numara girdiniz. Lütfen tekrar deneyin.");
        }
      } else {
        System.out.println("Geçersiz bir numara girdiniz.");
      }
    }
}
