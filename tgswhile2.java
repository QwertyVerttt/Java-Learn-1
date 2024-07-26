import java.util.Scanner;

public class tgswhile2 {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    int f = 1;

    System.out.print("Masukkan bilangan untuk dihitung : ");
    num = scanner.nextInt();

    if (num < 0) {
        System.out.println("Tidak dapat menghitung bilangan negatif.");
    } else {
        int i = 1;
        while (i <= num) {
            f *= i;
            i++;
        }
        System.out.println("Hasil dari " + num + " Adalah : "+f);
    }
    scanner.close();
 }   
}
