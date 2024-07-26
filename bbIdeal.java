import java.util.Scanner;
public class bbIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Mencari Berat Badan ideal Menggunakan BMI (Body Mass Index) ");
        
        System.out.println("Masukkan tinggi badan : ");
        
        float tb = scanner.nextFloat();
        tb = tb/100;
        
        System.out.println("Masukkan berat badan : ");
        
        float bb = scanner.nextFloat();

        float bmi = bb / (tb*tb);

        System.out.println("total BMI anda adalah : " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("Anda terlalu kurus ");
            System.out.println("Perbanyakki makan kanda ");
        } else if ((bmi >= 18.5) && (bmi < 23)) {
            System.out.println("Anda ideal ");
            System.out.println("Pertahankan kanda");
        } else if ((bmi >= 23) && (bmi < 25)){
            System.out.println("Anda kelebihan BB ");
            System.out.println("Lebih dikit ga ngaruh ");
        } else if ((bmi >= 25) && (bmi < 30)){
            System.out.println("Anda obesitas 1");
            System.out.println("Sebaiknya diet ");
        } else if (bmi >= 30) {
            System.out.println("Anda obesitas 2");
            System.out.println("Waduh");
        }
        scanner.close();
    }
}
