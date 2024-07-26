import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nomor bulan (1-12) : ");
        int bulan = scanner.nextInt();

        switch(bulan) {
            case 12,1,2:
            System.out.println("Musimnya adalah musim dingin");
            break;
            case 3,4,5:
            System.out.println("Musimnya adalah musim semi");
            break;
            case 6,7,8:
            System.out.println("Musimnya adalah musim panas");
            break;
            case 9,10,11:
            System.out.println("Musimnya adalah musim gugur");
            break;
            default:
            System.out.println("Nomor bulan tidak valid, tidak ada bulan "+bulan+" seperti yang diketikkan");
            break;
        }
        scanner.close();
    }   
}
