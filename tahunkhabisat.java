import java.util.Scanner;
public class tahunkhabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Apakah tahun yang anda masukkan merupakan tahun khabisat ");
        System.out.println("Masukkan tahun nya : ");
        
        int tahun = scanner.nextInt();

        if ((tahun % 4 == 0) && (tahun % 100 == 0) && (tahun % 400 == 0)) {
            System.out.println("Ya, tahun yang anda masukkan merupakan tahun khabisat");
        } else if ((tahun % 4 == 0) && (tahun % 100 != 0)) {
            System.out.println("Ya, tahun tersebut merupakan tahun khabisat");
        } else if ((tahun % 4 != 0) || (tahun % 400 != 0)) {
            System.out.println("Tidak, tahun tersebut bukanlah tahun khabisat ");
        } else {
            System.out.println("Anda tidak memasukkan tahun ");
        }
        scanner.close();
    }
}
