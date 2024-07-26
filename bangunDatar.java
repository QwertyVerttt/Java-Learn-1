import java.util.Scanner;
public class bangunDatar {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bangun datar seperti apa yang ingin dicari? segitiga/belah ketupat/layang layang/persegi/persegi panjang/jajar genjang/lingkaran/trapesium ");
    String userInput = scanner.nextLine();
    
    float sisi1,sisi2;

    if (userInput.equalsIgnoreCase("segitiga") || (userInput.equalsIgnoreCase("belah ketupat") || (userInput.equalsIgnoreCase("layang-layang")))) {
        System.out.println("Masukkan alas : ");
        sisi1 = scanner.nextFloat();
        System.out.println("Masukkan tinggi : ");
        sisi2 = scanner.nextFloat();
        System.out.println("Luas: " + (1/2f * sisi1 * sisi2) + "Cm2");
    } else if (userInput.equalsIgnoreCase("persegi")) {
        System.out.println("Masukkan sisi : ");
        sisi1 = scanner.nextFloat();
        System.out.println("Luas : " + (sisi1*sisi1));
    } else if (userInput.equalsIgnoreCase("persegi panjang") || (userInput.equalsIgnoreCase("jajar genjang"))) {
        System.out.println("Masukkan sisi 1 (p) : ");
        sisi1 = scanner.nextFloat();
        System.out.println("Masukkan sisi 2 (l): ");
        sisi2 = scanner.nextFloat();
        System.out.println("Luas: " + (sisi1*sisi2));
    } else if (userInput.equalsIgnoreCase("lingkaran")) {
        System.out.println("Masukkan jari-jari : ");
        sisi1 = scanner.nextFloat();
        System.out.println("Luas lingkaran adalah : " + (3.14f * (sisi1*sisi1)));
    } else if (userInput.equalsIgnoreCase("trapesium")) {
        System.out.println("Masukkan sisi : ");
        sisi1 =  scanner.nextFloat();
        System.out.println("Masukkan sisi : ");
        sisi2 =  scanner.nextFloat();
        System.out.println("Masukkan tinggi : ");
        float tinggi = scanner.nextFloat();
        System.out.println("Luas trapesium : " + (1/2f * (sisi1 + sisi2) * tinggi)); 
    }
    scanner.close();
    } 
}