import java.util.Scanner;
public class atm {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("====== SELAMAT DATANG DI ATM AGUNG ===========");
    System.out.println("                 PILIHAN MENU                 ");
    System.out.println("==============================================");
    System.out.println("| 1. Tarik Tunai                  Transfer .4|");
    System.out.println("|                                            |");
    System.out.println("| 2. Cek Saldo                  Pembayaran .5|");
    System.out.println("|                                            |");
    System.out.println("| 3. Setor tunai                             |");
    System.out.println("==============================================");
    System.out.print("Pilih Menu ATM 1 - 5 : ");
    int pilihan = scanner.nextInt();
    
    int saldo = 1000000;
    int tarikTunai,saldoAkhir,tagihan,nomor;

    switch (pilihan) {
        case 1:
        System.out.println("                 PILIHAN MENU                 ");
        System.out.println("==============================================");
        System.out.println("| 1. 100.000                                 |"); 
        System.out.println("| 2. 200.000                                 |"); 
        System.out.println("| 3. 300.000                                 |"); 
        System.out.println("| 4. 500.000                                 |"); 
        System.out.println("| 5. Jumlah lain                             |"); 
        System.out.println("==============================================");
        System.out.print("Pilih Menu ATM 1 - 5 : ");
        tarikTunai = scanner.nextInt();
        if (tarikTunai == 1) {
           saldoAkhir = saldo - 100000;
           System.out.println("Anda menarik sebesar 100.000Rp, saat ini saldo anda tersisa "+saldoAkhir+"Rp"); 
        } else if(tarikTunai == 2){
            saldoAkhir = saldo - 200000;
            System.out.println("Anda menarik sebesar 200.000Rp, saat ini saldo anda tersisa "+saldoAkhir+"Rp"); 
        } else if(tarikTunai == 3){
            saldoAkhir = saldo - 300000;
            System.out.println("Anda menarik sebesar 300.000Rp, saat ini saldo anda tersisa "+saldoAkhir+"Rp"); 
        } else if(tarikTunai == 4){
            saldoAkhir = saldo - 400000;
            System.out.println("Anda menarik sebesar 400.000Rp, saat ini saldo anda tersisa "+saldoAkhir+"Rp"); 
        } else if(tarikTunai == 5){
            System.out.println("Masukkan jumlah ");
            int tanya = scanner.nextInt();
            saldoAkhir = saldo - tanya;
            System.out.println("Anda menarik sebesar " +tanya +"Rp saat ini saldo anda tersisa " +saldoAkhir+"Rp"); 
        }else{
            System.out.println("Input tidak valid!");
        }
        break;
        case 2:
        System.out.println("Saldo anda "+saldo);
        break;
        case 3:
            System.out.println("Masukkan setoran 50.000/100.000");
            tarikTunai = scanner.nextInt();
            saldoAkhir = saldo+tarikTunai;
            System.out.println("Anda menyetor sebesar "+tarikTunai+"Rp");
            System.out.println("Saldo anda saat ini sebesar "+saldoAkhir+"Rp");
            saldo = saldoAkhir;
        break;
        case 4:
            System.out.println("Masukkan nomor rekening penerima contoh (123456)");
            int rekPenerima = scanner.nextInt();
            System.out.println("Masukkan jumlah transfer pecahan 50.000-100.000Rp");
            saldoAkhir = scanner.nextInt();
            System.out.println("Anda berhasil mentransfer ke "+rekPenerima+", sebesar "+saldoAkhir+"Rp, saldo anda saat ini tersisa "+ (saldo-saldoAkhir) +"Rp");
        break;
        case 5:
        System.out.println("Tersedia pembayaran 1.Wifi/ 2.Listrik ");
        int pilihan1 = scanner.nextInt();
        if ((pilihan1 == 1) || (pilihan1 == 2)) {
            System.out.println("Masukkan nomor/Token : ");
            nomor=scanner.nextInt();
            tagihan=20000;
            saldoAkhir=saldo-tagihan-2500;
            System.out.println("Nomor/Token anda adalah "+nomor+" dan Tagihan anda sebesar :"+tagihan+"Rp,"+" ditambah biaya admin 2.500Rp maka total tagihan adalah"+(tagihan+2500)+ " saat ini saldo anda tersisa "+saldoAkhir+"Rp");
        } else {
            System.out.println("Sesuatu yang anda masukkan tidak valid!");
        }
        break;
        default:
        System.out.println("Sesuatu yang anda inputkan tidak valid!");
        break;
    }
    scanner.close();
 }   
}