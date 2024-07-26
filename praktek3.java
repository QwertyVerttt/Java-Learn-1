import java.util.Scanner;
public class praktek3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        float tugas, mid, akhir, nfinal;
        int kelas, semester; //Float
        long nim; //Double

        System.out.print("Masukkan Nama : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = scanner.nextLong();
        System.out.print("Masukkan kelas : ");
        kelas  = scanner.nextInt();
        System.out.print("Masukkan Semester : ");
        semester = scanner.nextInt();
        System.out.print("Masukkan nilai Skumulasi tugas : ");
        tugas = scanner.nextFloat();
        System.out.print("Masukkan nilai Akumulasi mid : ");
        mid = scanner.nextFloat();
        System.out.print("Masukkan nilai Akumulasi final : ");
        nfinal = scanner.nextFloat();

        akhir = (tugas+mid+nfinal) / 3;
        
        System.out.println("Nilai akhir anda adalah = " + akhir);
        System.out.println(" Nama anda adalah "+ nama + " Nim anda adalah " + nim + " kelas anda adalah " + kelas + " Anda berada di semester " + semester);

        scanner.close();

    }    
}

