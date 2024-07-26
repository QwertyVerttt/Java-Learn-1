import java.util.Scanner;

public class pekerja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan, jumlahPegawai;
        String nama = "", jabatan = "", namaGajiTerbesar = "", namaGajiTerkecil = "";
        double gajiTerbesar = 0;
        double gajiTerkecil = 0;
        long nip;

        System.out.print("Masukkan jumlah pegawai : ");
        jumlahPegawai = scanner.nextInt();

        System.out.println("Urutan jabatan \n 1). Direksi \n 2). Manajer \n 3). Kepala staff \n 4). Staff ");
        System.out.println();
        int i = 1;
        while (i <= jumlahPegawai) {
            System.out.print("Masukkan jabatan pegawai ke- " + i + " (1 - 4) : ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan nama pegawai ke- " + i + " : ");
            nama = scanner.nextLine();
            System.out.print("Masukkan NIP Pegawai ke- " + i + " : ");
            nip = scanner.nextLong();

            double gajiAwal = 0;

            switch (pilihan) {
                case 1:
                    jabatan = "Direktur";
                    gajiAwal = 7500000;
                    break;
                case 2:
                    jabatan = "Manajer";
                    gajiAwal = 5000000;
                    break;
                case 3:
                    jabatan = "Kepala staff";
                    gajiAwal = 3500000;
                    break;
                case 4:
                    jabatan = "Staff";
                    gajiAwal = 2500000;
                    break;
                default:
                    System.out.print("Inputan tidak valid coba ulangi : ");
                    continue;
            }

            System.out.print("Kehadiran dalam 1 bulan (30 Hari) pegawai ke- " + i + " : ");
            int kehadiran = scanner.nextInt();
            System.out.print("Total lembur dalam 1 bulan (30 Hari) pegawai ke- " + i + " : ");
            int lembur = scanner.nextInt();
            System.out.print("Jumlah jam terlambat (1 / Jam) pegawai ke- " + i + " : ");
            int terlambat = scanner.nextInt();
            System.out.print("Jumlah istri pegawai ke-" + i + " : ");
            int istri = scanner.nextInt();
            System.out.print("Jumlah anak pegawai ke-" + i + " : ");
            int anak = scanner.nextInt();

            double bonusLembur = 50000 * lembur;
            double tunjanganTransportasi = 20000 * kehadiran;
            double tunjanganMakan = 20000 * kehadiran;
            double tunjanganIstri = 0;

            if ((istri < 3) && (istri > 0)) {
                tunjanganIstri = 200000 * istri;
            } else if (istri >= 3) {
                tunjanganIstri = 1000000;
            } 

            double tunjanganAnak = 0;
            if ((anak < 3) && (anak > 0)) {
                tunjanganAnak = 100000 * anak;
            } else if (anak >= 3) {
                tunjanganAnak = 500000;
            }

            double bpjs = 0;
            System.out.print("Masukkan tingkatan BPJS pegawai (1 - 3) ke- " + i + " : ");
            int tingkatanBpjs = scanner.nextInt();

            switch (tingkatanBpjs) {
                case 1:
                    bpjs = 150000;
                    break;
                case 2:
                    bpjs = 100000;
                    break;
                case 3:
                    bpjs = 35000;
                    break;
                default:
                    System.out.print("Mohon masukkan tingkatan antara (1 - 3) : ");
                    continue;
            }

            double potongan = terlambat * 5000;
            double totalTunjangan = tunjanganTransportasi + tunjanganAnak + tunjanganIstri + tunjanganMakan;
            double pajak = 0.025 * (gajiAwal + totalTunjangan + bonusLembur);
            double totalGaji = gajiAwal + totalTunjangan + bonusLembur - potongan - bpjs - pajak;

            System.out.println();
            System.out.println("Total gaji untuk " + nama + " Dengan NIP " + nip + " (" + jabatan + ") Adalah : " + totalGaji + " Rp");
            System.out.println();
            
            if (i == 1) {
                gajiTerbesar = totalGaji;
                gajiTerkecil = totalGaji;
                namaGajiTerbesar = nama;
                namaGajiTerkecil = nama;
            } else {
                if (totalGaji > gajiTerbesar) {
                    gajiTerbesar = totalGaji;
                    namaGajiTerbesar = nama;
                }
                if (totalGaji < gajiTerkecil) {
                    gajiTerkecil = totalGaji;
                    namaGajiTerkecil = nama;
                }
            }
            i++;
        }
        System.out.println("Pegawai dengan gaji terbesar : " + namaGajiTerbesar + " dengan total gaji : " + gajiTerbesar);
        System.out.println();
        System.out.println("Pegawai dengan gaji terkecil : " + namaGajiTerkecil + " dengan total gaji : " + gajiTerkecil);
        System.out.println("Total pegawai adalah :" +jumlahPegawai+" Orang");
    }
}