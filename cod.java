import java.util.Scanner;
public class cod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("            PILIHAN BARANG GUNGSHOP           ");
        System.out.println("===============================================");
        System.out.println("| 1. SEPATU  Rp 120.000                       |");
        System.out.println("| 2. BAJU    Rp 50.000                        |");
        System.out.println("| 3. JAKET   Rp 80.000                        |");
        System.out.println("===============================================");
        System.out.print("Pilihan Thrift 1 - 3 : ");
        int pilihan = scanner.nextInt();
        System.out.println();
        System.out.println();
        int uang = 1000000;
        int nomor,harga;
        float diskon;
        switch (pilihan) {
        case 1:
        System.out.println("                  METODE PEMBAYARAN             ");
        System.out.println("================================================");
        System.out.println("| 1. COD                                       |");
        System.out.println("| 2. INDOMARET                                 |");
        System.out.println("| 3. TRANSFER ATM                              |");
        System.out.println("================================================");
        int pilihan1 = scanner.nextInt();
        System.out.print("Masukkan jumlah pemesanan ");
        int jumlahPemesanan = scanner.nextInt();
        if ((pilihan1 == 1) && (jumlahPemesanan < 3)) {
            System.out.println("Paket anda siap dalam 3-7 hari, siapkan uang sebesar Rp 120.000");
        } else if ((pilihan1 == 1) && (jumlahPemesanan >= 3)) {
            diskon = jumlahPemesanan*120000 * 0.1f;
            float total = jumlahPemesanan*120000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 2) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 120000;
            System.out.println("Pembayaran dengan Akun VA anda nomor "+nomor+" berhasil membeli Item dengan Harga barang sebesar Rp"+harga+" Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo anda Rp"+(uang-harga));
        } else if ((pilihan1 == 2) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*120000* 0.1f;
            float total = jumlahPemesanan*120000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 3) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 120000;
            System.out.println("Harga barang sebesar Rp"+harga+" ,Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo di rekening anda Rp"+(uang-harga));
        } else if ((pilihan1 == 3) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*120000* 0.1f;
            float total = jumlahPemesanan*120000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        }
        break;
        case 2:
        System.out.println("                  METODE PEMBAYARAN             ");
        System.out.println("================================================");
        System.out.println("| 1. COD                                       |");
        System.out.println("| 2. INDOMARET                                 |");
        System.out.println("| 3. TRANSFER ATM                              |");
        System.out.println("================================================");
        pilihan1 = scanner.nextInt();
        System.out.print("Masukkan jumlah pemesanan ");
        jumlahPemesanan = scanner.nextInt();
        if ((pilihan1 == 1) && (jumlahPemesanan < 3)) {
            System.out.println("Paket anda siap dalam 3-7 hari, siapkan uang sebesar Rp 50.000");
        } else if ((pilihan1 == 1) && (jumlahPemesanan >= 3)) {
            diskon = jumlahPemesanan*50000 * 0.1f;
            float total = jumlahPemesanan*50000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 2) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 50000;
            System.out.println("Pembayaran dengan Akun VA anda nomor "+nomor+" berhasil membeli Item dengan Harga barang sebesar Rp"+harga+" Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo anda Rp"+(uang-harga));
        } else if ((pilihan1 == 2) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*50000 * 0.1f;
            float total = jumlahPemesanan*50000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 3) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 50000;
            System.out.println("Harga barang sebesar Rp"+harga+" ,Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo di rekening anda Rp"+(uang-harga));
        } else if ((pilihan1 == 3) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*50000 * 0.1f;
            float total = jumlahPemesanan*50000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        }
        break;
        case 3:
        System.out.println("                  METODE PEMBAYARAN             ");
        System.out.println("================================================");
        System.out.println("| 1. COD                                       |");
        System.out.println("| 2. INDOMARET                                 |");
        System.out.println("| 3. TRANSFER ATM                              |");
        System.out.println("================================================");
        pilihan1 = scanner.nextInt();
        jumlahPemesanan = scanner.nextInt();
        if ((pilihan1 == 1) && (jumlahPemesanan < 3)) {
            System.out.println("Paket anda siap dalam 3-7 hari, siapkan uang sebesar Rp 80.000");
        }  else if ((pilihan1 == 1) && (jumlahPemesanan >= 3)) {
            diskon = jumlahPemesanan*80000 * 0.1f;
            float total = jumlahPemesanan*80000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 2) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 80000;
            System.out.println("Pembayaran dengan Akun VA anda nomor "+nomor+" berhasil membeli Item dengan Harga barang sebesar Rp"+harga+" Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo anda Rp"+(uang-harga));
        } else if ((pilihan1 == 2) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor VA anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*80000 * 0.1f;
            float total = jumlahPemesanan*80000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        } else if((pilihan1 == 3) && (jumlahPemesanan < 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            harga = 80000;
            System.out.println("Harga barang sebesar Rp"+harga+" ,Total saldo anda sebesar Rp"+uang+" Pembayaran berhasil sisa saldo di rekening anda Rp"+(uang-harga));
        } else if ((pilihan1 == 3) && (jumlahPemesanan >= 3)) {
            System.out.println("Masukkan nomor REK anda cth. (124-431) ");
            nomor = scanner.nextInt();
            diskon = jumlahPemesanan*80000* 0.1f;
            float total = jumlahPemesanan*80000;
            System.out.println("Anda mendapatkan diskon sebesar 10% ,biaya pesananan anda adalah Rp" + total + " dikurangi diskon sebesar Rp"+diskon+" Jumlah pembayaran anda adalah Rp" + (total-diskon));
        }
        break;
        default:
        System.out.println("Maaf Item tidak valid!");
        break;
        }
        scanner.close();
    }    
}
