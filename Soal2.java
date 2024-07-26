import java.util.Scanner;

public class Soal2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1,x2,x3,Koofisien,pangkat_1,pangkat_2,pangkat_3;
         
        char operator_1, operator_2 ,operator_3;

        System.out.println("Tentukan Koofisien x1 : ");
        x1 = scanner.nextInt();
        System.out.println("Tentukan Eksponen untuk x1 : ");
        pangkat_1 = scanner.nextInt();
        System.out.println("Masukkan operator (+) : ");
        operator_1 = scanner.next().charAt(0);
        System.out.println("Tentukan Koofisien x2 : ");
        x2 = scanner.nextInt();
        System.out.println("Tentukan Eksponen untuk x2 : ");
        pangkat_2 = scanner.nextInt();
        System.out.println("Masukkan operator (+) : ");
        operator_2 = scanner.next().charAt(0);
        System.out.println("Tentukan Koofisien x3 : ");
        x3 = scanner.nextInt();
        System.out.println("Tentukan Eksponen untuk x3 : ");
        pangkat_3 = scanner.nextInt();
        System.out.println("Masukkan operator (+)");
        operator_3 = scanner.next().charAt(0);
        System.out.println("Tentukan koofisien akhir : ");
        Koofisien = scanner.nextInt();

        System.out.println("Persamaan dari y = " + x1 + "x^" +pangkat_1+ " "+ operator_1 +" "+ x2 + "x^" + pangkat_2 + " " +operator_2+ " " + x3 + "x^" + pangkat_3 + " "+operator_3+" " + Koofisien);
        
        int hasilPolenomial1 = x1 * pangkat_1;
        int hasilPolenomial2 = x2 * pangkat_2;
        int hasilPolenomial3 = x3 * pangkat_3;
        
        pangkat_1 -= 1;
       
        pangkat_2 -= 1;
       
        pangkat_3 -= 1;
        
        System.out.println("Turunan dari y' = " + hasilPolenomial1 + "x^" +pangkat_1+ " "+ operator_1 +" "+ hasilPolenomial2 + "x^" + pangkat_2 + " " +operator_2+ " " + hasilPolenomial3 + "x^" + pangkat_3 );
        
        System.out.println("Masukkan nilai variable x = ");
        int nilaix = scanner.nextInt();

        int turunanNilai1 = (int)Math.pow(nilaix, pangkat_1);
        int turunanNilai2 = (int)Math.pow(nilaix, pangkat_2);
        int turunanNilai3 = (int)Math.pow(nilaix, pangkat_3);

        turunanNilai1 *= hasilPolenomial1;
        turunanNilai2 *= hasilPolenomial2;
        turunanNilai3 *= hasilPolenomial3;

        System.out.println("Jika x = " + nilaix + " " + " --> " + turunanNilai1  +" "+ operator_1+ " " + turunanNilai2 + " " + operator_2 + " " + turunanNilai3+ " ");

        int hasilAkhir = turunanNilai1 + turunanNilai2 + turunanNilai3;
        System.out.println("Jika nilai x = "+ nilaix+ " , maka hasil"+" akhirnya = "+hasilAkhir);
        scanner.close();
    }
}