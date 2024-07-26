import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angka1,angka2,hasil;

        System.out.println("Masukkan angka pertama : ");
        angka1 = scanner.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        System.out.println("Masukkan angka kedua : ");
        angka2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil : "+hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: "+hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil : "+hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil : "+hasil);
                } else {
                    System.out.println("Error: Pembagian dengan 0");
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                break;
        }
        scanner.close();
    }
}
