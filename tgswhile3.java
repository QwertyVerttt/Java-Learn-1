import java.util.Scanner;

public class tgswhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;
        int j = 0;
        int a;

        System.out.println("Program menghitung rata-rata bilangan positif.");
        System.out.println("Masukkan bilangan positif (0 untuk berhenti) : ");

        do{
            System.out.print("Masukkan bilangan: ");
            a = scanner.nextInt();

            if (a > 0) {
                total += a;
                count++;
            }else if (a < 0) {
                System.out.println("Bilangan negatif tidak diperbolehkan!");
            } 
        } while (a != 0);
        if (count > 0) {
            double r = (double) total / count;
            System.out.println("Rata-rata dari " + j + " Bilangan positif yang dimasukkan adalah : " + r);
        } else {
            System.out.println("Tidak ada bilangan positif yang dimasukkan.");
        }
        scanner.close();
    }
}

