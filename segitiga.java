import java.util.Scanner;
public class segitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sisiA,sisiB,sisiC; 

        System.out.print("Masukkan panjang sisi a : ");
        sisiA = scanner.nextFloat();
        System.out.print("Masukkan panjang sisi b : ");
        sisiB = scanner.nextFloat();
        System.out.print("Masukkan panjang sisi c : ");
        sisiC = scanner.nextFloat();

        if ((sisiA == sisiB) && (sisiA != sisiC) || (sisiB == sisiC) && (sisiB != sisiA) || (sisiC == sisiA) && (sisiC != sisiB)) {
            System.out.println("Itu adalah segitiga sama kaki");
        } else if ((sisiA == sisiB) && (sisiB == sisiC)) {
            System.out.println("Itu adalah segitiga sama sisi");
        } else {
            System.out.println("Itu adalah segitiga sembarang");
        }
        scanner.close();
    }
}