import java.util.Scanner;
import java.util.Random;
public class dwhl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); 
        int x = 0;
        int y = random.nextInt(6)+1;
        int b = 6;
        int a = 3;
        int c = 2;
        while (x < a) {
            System.out.print("Tebak dadu (1 - 6) batas percobaan anda " + a + " kali, \nsilahkan tebak : ");
            int z = scanner.nextInt();
            if ((z < y) || (z > y) && (z <= b)) {
                System.out.println();
                System.out.println("Tebakan anda salah " );
                System.out.println("Sisa tebakan : " + c);
                System.out.println();
            } else if (z == y) {
                System.out.println("Anda benar ");
                break;
            } else if (z > b){
                System.out.println("Inputan anda salah ulangi ");
                continue;
            }
            x++;
            c--;
            if (x == 3) {
                    System.out.println("Anda telah salah sebanyak 3 kali, bilangan yang benar adalah : "+ y);
                    System.out.println();
                }
            if (x==a){
                System.out.println("Apakah anda mau ulang? (y/n) :");
                scanner.nextLine();
                String tanya = scanner.nextLine();
                if (tanya.equalsIgnoreCase("y")) {
                    x = 0;
                    y = random.nextInt(6) + 1; 
                    c = a - 1; 
                }   else if (tanya.equalsIgnoreCase("n")){
                    System.out.println("Anda telah salah sebanyak 3 kali, bilangan yang benar adalah : "+ y);
                    break;
                }   else {
                    System.out.println("Inputan anda salah ketik (y/n) ");
                    continue;
                }
            }
        }
        scanner.close();
    }
}

