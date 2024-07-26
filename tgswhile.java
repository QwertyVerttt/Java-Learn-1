import java.util.Scanner;
public class tgswhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int maxAttempts = 3;
        int attemp = 0;
        
        System.out.println("Tebak angka dari 1 dan 10");

        while (attemp < maxAttempts) {
            System.out.print("Masukkan tebakan anda : ");
            
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Angka harus antara 1 dan 10");
                attemp++;
                continue;
            }

            if (number == 7) {
                System.out.println("Selamat, tebakan anda benar ");
                break;
            } else {
                System.out.println("Tebakan anda salah ");
                attemp++;
            }
        }
        if (attemp == maxAttempts) {
            System.out.println("Anda telah menggunakan semua kesempatan, jawabannya adalah angka 7.");
        }
        scanner.close();
    }
}