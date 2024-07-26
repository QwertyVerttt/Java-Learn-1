import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silahkan pilih buaht favorit anda di daftar berikut : ");
        System.out.println("1. Apel");
        System.out.println("2. Pisang");
        System.out.println("3. Jeruk");
        System.out.println("4. Mangga");
        System.out.println("Masukkan nama buah (Apel/Pisang/Jeruk/Mangga)");

        String pilihanBuah = scanner.nextLine();

        switch (pilihanBuah) {
            case "Apel":
                System.out.println("Apel adalah buah yang kaya akan serat dan baik untuk pencernaan.");
                break;
            case "Pisang":
                System.out.println("Pisang adalah sumber kalium yang baik dan memberikan energi cepat.");
                break;
            case "Jeruk":
                System.out.println("Jeruk mengandung banyak vitamin C yang baik untuk kekebalan tubuh.");
                break;
            case "Mangga":
                System.out.println("Mangga adalah buah yang manis dan kaya akan vitamin A.");
                break;
                default:
                System.out.println("Buah yang anda pilih tidak ada dalam daftar.");
                break;
        }
        scanner.close();
    }
}
