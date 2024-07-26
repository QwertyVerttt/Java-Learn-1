import java.util.Scanner;
public class metodepembayaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hargaBarang = 0, lanjutTransaksi;
        int jumlahBarang = 0, jenisPembayaran, metodeTransfer;

        System.out.println("Pilihan barang: ");
        System.out.println("1. KOMIK (Rp 25000)");
        System.out.println("2. KORAN (Rp 15000)");
        System.out.println("3. MAJALAH (Rp 20000)");
        System.out.print("Masukkan pilihan barang yang akan dibeli (1/2/3): ");
        int inputBarang = scanner.nextInt();

        switch (inputBarang) {
            case 1:hargaBarang = 25000;
                break;
            case 2:hargaBarang = 15000;
                break;
            case 3:hargaBarang = 20000;
                break;
            default:System.out.println("Barang tidak valid!");
                break;
        }
        System.out.print("Masukkan jumlah barang yang akan dibeli: ");
        jumlahBarang = scanner.nextInt();
        System.out.println("Pilih jenis pembayaran:");
        System.out.println("1. COD (Cash On Delivery)");
        System.out.println("2. Non-COD (Transfer Bank)");
        System.out.print("Masukkan jenis pembayaran (1/2): ");
        jenisPembayaran = scanner.nextInt();

        switch (jenisPembayaran) {
            case 1:
                System.out.println("Biaya penanganan COD sebanyak: Rp.500");
                System.out.println("Total yang harus anda bayar sebanyak: Rp." + ((hargaBarang*jumlahBarang)+500));
                System.out.print("Lanjut transaksi?\n1.Ya\n2.Tidak\nMasukkan pilihan (1/2): ");
                lanjutTransaksi = scanner.nextInt();
                if (lanjutTransaksi == 1) {
                    System.out.println("Silahkan siapkan cash anda sebanyak: Rp." + ((hargaBarang*jumlahBarang)+500));
                } else {System.out.println("Transaksi");}
                break;
            case 2:
                System.out.println("Pilih metode pembayaran:");
                System.out.println("1. Indomaret (Biaya admin Rp 2500)");
                System.out.println("2. Transfer Bank");
                System.out.print("Masukkan metode pembayaran (1/2): ");
                metodeTransfer = scanner.nextInt();
                if (metodeTransfer == 1) {
                    System.out.println("Anda mendapatkan diskon sebanyak 3% = Rp." + (hargaBarang * jumlahBarang) *0.03);
                    System.out.println("Total yang harus anda bayar sebanyak: Rp." + ((hargaBarang*jumlahBarang)-((hargaBarang * jumlahBarang) *0.03)+2500));
                    System.out.print("Lanjut transaksi?\n1.Ya\n2.Tidak\nMasukkan pilihan (1/2): ");
                    lanjutTransaksi = scanner.nextInt();
                    if (lanjutTransaksi == 1) {
                        System.out.println("Silahkan melakukan pembayaran di indomart dengan kode 123456789 sebanyak Rp." + ((hargaBarang*jumlahBarang)-((hargaBarang * jumlahBarang) *0.03)+2500));
                    }else{System.out.println("Transaksi dibatalkan");}
                } else if (metodeTransfer == 2) {
                    System.out.println("Pilih bank tujuan transfer:");
                    System.out.println("1. BRI (Tanpa biaya admin)");
                    System.out.println("2. Bank lain (Biaya admin Rp 2500)");
                    System.out.print("Masukkan nomor bank (1/2): ");
                    int bankPembayaran = scanner.nextInt();
                    if (bankPembayaran == 1) {
                        System.out.println("Total yang harus anda bayar sebanyak: Rp."+ (hargaBarang*jumlahBarang));
                        System.out.print("Lanjut transaksi?\n1.Ya\n2.Tidak\nMasukkan pilihan (1/2): ");
                        lanjutTransaksi = scanner.nextInt();
                        if (lanjutTransaksi == 1) {
                            System.out.println("Silahkan lakukan pembayaran melalui menu briva dengan nomor kode 123456789 sebanyak: Rp." +(hargaBarang*jumlahBarang));
                        }else{System.out.println("Transaksi dibatalkan");}
                    }else if(bankPembayaran == 2){
                        System.out.println("Anda mendapatkan diskon sebanyak 2%  = Rp." +((hargaBarang * jumlahBarang) *0.2) +"dan potongan pajak sebesar 2500");
                        System.out.println("Total belanjaan anda sebanyak: Rp." + ((hargaBarang*jumlahBarang)-((hargaBarang * jumlahBarang) *0.2)+3000));
                        System.out.print("Lanjut transaksi?\n1.Ya\n2.Tidak\nMasukkan pilihan (1/2): ");
                        lanjutTransaksi = scanner.nextInt();
                        if (lanjutTransaksi == 1){
                            System.out.println("Silahkan transfer ke Bank BRI dengan nomor rekening 123456789 sebanyak: Rp." + ((hargaBarang*jumlahBarang)-((hargaBarang * jumlahBarang) *0.2)+3000));
                        }else{System.out.println("Transaksi dibatalkan");}
                    }else{System.out.println("Pilihan tidak valid");}   
                } else {System.out.println("Metode pembayaran tidak valid!");}
                break;
            default:System.out.println("Jenis pembayaran tidak valid!");
            break;     
        }
    }
}

