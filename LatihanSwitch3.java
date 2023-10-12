import java.util.Scanner;

public class LatihanSwitch3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kota tujuan : ");
        String kotaTujuan = input.nextLine();

        System.out.println("Masukkan jumlah penumpang : ");
        int jumlahPenumpang = input.nextInt();

        switch (kotaTujuan) {
            case "Jakarta":
                System.out.println("Harga tiket = " + jumlahPenumpang * 145000);
                break;
            case "Bogor":
                System.out.println("Harga tiket = " + jumlahPenumpang * 200000);
                break;
            case "Garut":
                System.out.println("Harga tiket = " + jumlahPenumpang * 75000);
                break;
            case "Purwakarta":
                System.out.println("Harga tiket = " + jumlahPenumpang * 75000);
                break;
            default:
                break;
        }
    }
}
