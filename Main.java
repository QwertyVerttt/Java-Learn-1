import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int percobaan = 0;
        int batasPercobaan = 5;
        int Randem = random.nextInt(100)+1;
        int tebakan = Randem;

        System.out.println("mari bermain tebak tebak angka 1-100, anda mendapat batas 5 percobaan");
        
        while (percobaan < batasPercobaan) {
            System.out.print("Coba tebak angka dari 1 - 100 : ");
            int tanya = scanner.nextInt();
            percobaan++;

            if ((tanya < tebakan ) && (percobaan < batasPercobaan)){
                System.out.println("Tebakan anda terlalu kecil ");
            } else if ((tanya > tebakan) && (percobaan < batasPercobaan))  {
                System.out.println("Tebakan anda terlalu besar");
            } else if ( tanya == tebakan) {
                System.out.println("Tebakan anda benar anda menebak angka "+tebakan+" dalam " + percobaan + " Percobaan");
                break;
            } else if ((tanya != tebakan) && (tanya >= batasPercobaan)) {
                System.out.println("Anda telah melewati batas percobaan, tebakan yang benar adalah "+tebakan+" Bro pikir dia bisa");
                break;
            } else if ((tanya > 100) || (tanya < 0)) {
                System.out.println("Bro pikir bisa");
            } else {
                System.out.println("Bro stop");
            }
        }
    }
}