import java.util.Scanner;
public class praktek {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float p,l,luas;
    String a,b;

    System.out.print("Masukkan teks a : ");
    a = scanner.nextLine();
    System.out.print("Masukkan teks b : ");
    b = scanner.nextLine();

    System.out.print("Masukkan panjang : ");
    p = scanner.nextFloat();

    System.out.print("Masukkan lebar : ");
    l = scanner.nextFloat();

    luas = p * l;
    System.out.print("Luas nya adalah " + luas + " dan Teks yang di sambung adalah " + a + " " + b);
    scanner.close();

}    
}

