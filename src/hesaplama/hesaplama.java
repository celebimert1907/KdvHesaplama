package hesaplama;

import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kdv = 0.18;
        double kdvSizFiyat = 0;
        double kdvLiFiyat;
        double kdvTutari;

        System.out.print("Fiyat Giriniz: ");
        kdvSizFiyat = input.nextFloat();

        System.out.print("KDV: ");
        System.out.println(kdv);

        System.out.print("KDVsiz fiyat: ");
        System.out.println(kdvSizFiyat);

        kdvLiFiyat = (kdvSizFiyat*kdv)+(kdvSizFiyat);
        System.out.print("KDVli fiyat: ");
        System.out.println(kdvLiFiyat);

        kdvTutari = kdvLiFiyat - kdvSizFiyat;
        System.out.print("KDV tutari: ");
        System.out.println(kdvTutari);

    }
}
