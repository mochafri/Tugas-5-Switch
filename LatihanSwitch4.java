import java.util.Scanner;

public class LatihanSwitch4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kota tujuan : ");
        String kotaTujuan = input.nextLine();

        System.out.println("Masukkan jumlah penumpang : ");
        int jumlahPenumpang = input.nextInt();

        int hargaTiket;
        int promo;

        switch (kotaTujuan) {
            case "Jakarta":
                hargaTiket = jumlahPenumpang * 145000;
                System.out.println("Harga tiket = " + hargaTiket);

                if (hargaTiket > 250000) {
                    promo = hargaTiket * 10 / 100;
                    System.out.println("anda mendapat promo sebesar = " + promo);
                    System.out.println("total harga tiket = " + (hargaTiket - promo));
                }
                break;

            case "Bogor":
                hargaTiket = jumlahPenumpang * 200000;
                System.out.println("Harga tiket = " + hargaTiket);

                if (hargaTiket > 250000) {
                    promo = hargaTiket * 10 / 100;
                    System.out.println("anda mendapat promo sebesar = " + promo);
                    System.out.println("total harga tiket = " + (hargaTiket - promo));
                }
                break;

            case "Garut":
                hargaTiket = jumlahPenumpang * 75000;
                System.out.println("Harga tiket = " + hargaTiket);

                if (hargaTiket > 250000) {
                    promo = hargaTiket * 10 / 100;
                    System.out.println("anda mendapat promo sebesar = " + promo);
                    System.out.println("total harga tiket = " + (hargaTiket - promo));
                }
                break;

            case "Purwakarta":
                hargaTiket = jumlahPenumpang * 75000;
                System.out.println("Harga tiket = " + hargaTiket);

                if (hargaTiket > 250000) {
                    promo = hargaTiket * 10 / 100;
                    System.out.println("anda mendapat promo sebesar = " + promo);
                    System.out.println("total harga tiket = " + (hargaTiket - promo));
                }
                break;
            default:
                break;
        }
    }
}
