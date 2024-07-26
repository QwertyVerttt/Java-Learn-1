import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double x1,x2,y1,y2,z1,z2;

        System.out.println("Masukkan nilai x1 = ");
        x1 = scanner.nextDouble();
        System.out.println("Masukkan nilai x2 = ");
        x2 = scanner.nextDouble();
        System.out.println("Masukkan nilai y1 = ");
        y1 = scanner.nextDouble();
        System.out.println("Masukkan nilai y2 = ");
        y2 = scanner.nextDouble();
        System.out.println("Masukkan nilai z1 = ");
        z1 = scanner.nextDouble();
        System.out.println("Masukkan nilai z2 = ");
        z2 = scanner.nextDouble();

        Double jarakAB = Math.pow((x1 + x2), 2);
        Double jarakBC = Math.pow((y1 + y2), 2);
        Double jarakCA = Math.pow((z1 + z2), 2);

        Double AB = Math.sqrt(jarakAB);
        Double BC = Math.sqrt(jarakBC);
        Double CA = Math.sqrt(jarakCA);


        System.out.println("Jarak dari Koordinat A ke B = " + AB);
        System.out.println("Jarak dari Koordinat B ke C = " + BC);
        System.out.println("Jarak dari Koordinat C ke A = " + CA);

        Double totalJarak = AB + BC + CA;

        System.out.println("Total jarak seluruh koordinat adalah " + totalJarak);


    scanner.close();        
    }
}