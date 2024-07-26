import java.util.Scanner;
public class diskon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih barang : 1). A = 10.000Rp, 2). B = 30.000Rp, 3). C = 40.000Rp : ");
        int pilih = scanner.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        int jumlah = scanner.nextInt();
        
        if ((pilih == 1) && (jumlah >= 4)){    
            System.out.println("Anda mendapat diskon sebesar 10% : "+ (jumlah*10000 *0.1f));
            System.out.println("Total belanjaan anda dikurangi diskon : " + ((jumlah * 10000) - (jumlah *10000*0.1f)));
        } else if ((pilih == 1) && (jumlah < 4)) {
            System.out.println("Total bayaran anda :" + (jumlah*10000));
        } else if ((pilih == 2) && (jumlah >= 2)){
            System.out.println("Anda mendapat diskon sebesar 5% : "+ (jumlah*30000*0.05f));
            System.out.println("Total belanjaan anda dikurangi diskon : " + ((jumlah * 30000) - (jumlah *30000*0.05f)));
        } else if ((pilih == 2) && (jumlah < 2)) {
            System.out.println("Total bayaran anda :" + (jumlah*30000));
        } else if ((pilih == 3) && (jumlah >= 3)){
            System.out.println("Anda mendapat diskon sebesar 20% : "+ (jumlah*40000*0.2f));
            System.out.println("Total belanjaan anda dikurangi diskon : " + ((jumlah * 40000) - (jumlah *40000*0.2f)));
        } else if ((pilih == 3) && (jumlah < 3)) {
            System.out.println("Total bayaran anda :" + (jumlah*40000));
        }
        scanner.close();
    }
}