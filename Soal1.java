import java.util.Scanner;
public class Soal1 { 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("MENCARI KUAT ARUS DARI 7 HAMBATAN");
        Double R1,R2,R3,R4,R5,R6,R7,V;

        System.out.println("Tentukan nilai R1(Hambatannya) = ");
        R1 = scanner.nextDouble();
        System.out.println("Tentukan nilai R2(Hambatannya) = ");
        R2 = scanner.nextDouble();
        System.out.println("Tentukan nilai R3(Hambatannya) = ");
        R3 = scanner.nextDouble();
        System.out.println("Tentukan nilai R4(Hambatannya) = ");
        R4 = scanner.nextDouble();
        System.out.println("Tentukan nilai R5(Hambatannya) = ");
        R5 = scanner.nextDouble();
        System.out.println("Tentukan nilai R6(Hambatannya) = ");
        R6 = scanner.nextDouble();
        System.out.println("Tentukan nilai R7(Hambatannya) = ");
        R7 = scanner.nextDouble();
        System.out.println("Tentukan nilai V(Tegangannya) = ");
        V = scanner.nextDouble();
        //RANGKAIAN 1
        Double Rs1 = R2+R3; //R2 DAN R3 MERUPAKAN RANKGAIAN SERI

        Double Rtotal1 = Math.pow((1.0 / R1) + (1.0 / Rs1), -1); //KEMUDIAN DI HUBUNGKAN KE R1 DENGAN PARALEL 

        //LANJUT KE RANGKAIAN 2
        Double Rs2 = R4+R5; //R4 DAN R5 MERUPAKAN RANGKAIAN SERI
        
        Double totalRseri1 = Rs1;
        Double totalRseri2 = Rs2;
        Double totalParalel = Math.pow((1.0 / R1) + ((1.0 / R6 + 1.0 / R7)), -1);
        
        Double Rtotal2 = Math.pow((1.0 / Rs2) + ((1.0 / R6 + 1.0 / R7)), -1); //DIHUBUNGKAN KE R6 DAN R7 SECARA PARALEL

        Double RtotalCampuran = Rtotal1 + Rtotal2;

        Double i = V/RtotalCampuran;

        System.out.println("Berikut adalah kuat arusnya (I) = " + i);

        System.out.println("Pembuktian apakah tegangan = " + V + "V");

        Double Vtotal = i*RtotalCampuran;

        Double Vseri1 = i*totalRseri1;

        Double Vseri2 = i*totalRseri2;
        
        Double totalVseri = i* (Rs1+Rs2);

        Double Vparalel = i*totalParalel;

        System.out.println("V Total = " + Vtotal + "V");
        System.out.println("Vparalel = " + Vparalel + " " + " Dan" + " Vseri 1 = " + Vseri1 + " Vseri 2 = " + Vseri2 + " VseriTotal = " + totalVseri);
        scanner.close();
        
    }
}
