import java.util.Scanner;
public class diskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diskon Barang ");
        float Harga,totalBarang,totalDiskon,totalHarga;

        System.out.println("Masukkan total barang : ");
        totalBarang = scanner.nextFloat();
        System.out.println("Masukkan total harga dari total barang : ");
        Harga = scanner.nextFloat();

        if ((totalBarang >= 4) && (Harga >= 10000) && (Harga < 30000)) {
            System.out.println("Harga barang anda adalah : " + Harga + "Rp");
            totalDiskon = Harga * 0.1f;
            System.out.println("Anda mendapatkan diskon 10%, sebesar : " +totalDiskon+ "Rp");
            totalHarga = Harga - totalDiskon;
            System.out.println("Total harga keseluruhan dengan diskon adalah sebesar : " + totalHarga + "Rp");
        } else if ((totalBarang >= 2) && (Harga >= 30000) && (Harga < 40000)){
            System.out.println("Harga barang anda adalah : " + Harga + "Rp");
            totalDiskon = Harga * 0.05f;
            System.out.println("Anda mendapatkan diskon 5%, sebesar : " +totalDiskon+ "Rp");
            totalHarga = Harga - totalDiskon;
            System.out.println("Total harga keseluruhan dengan diskon adalah sebesar : " + totalHarga + "Rp");
        } else if ((totalBarang >= 3) && (Harga >= 40000)){
            System.out.println("Harga barang anda adalah : " + Harga + "Rp");
            totalDiskon = Harga * 0.2f;
            System.out.println("Anda mendapatkan diskon 20%, sebesar : " +totalDiskon+ "Rp");
            totalHarga = Harga - totalDiskon;
            System.out.println("Total harga keseluruhan dengan diskon adalah sebesar : " + totalHarga + "Rp");
        } else {
            System.out.println("Harga barang anda adalah : " + Harga + "Rp");
            System.out.println("Maaf anda tidak mendapat diskon" );
            System.out.println("Total harga keseluruhan tanpa diskon adalah sebesar : " + Harga + "Rp");
        }
        scanner.close();
    }
}
