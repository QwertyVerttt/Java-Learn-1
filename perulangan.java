import java.util.Random;
public class perulangan {
    public static void main(String[] args){
        int p, a, x, b, i, d, Iterbesar=0, Iterkecil=0;
        float t, c, D, h, f, th, tertinggi=0,terendah=0;
        float ma, mn;
        int j = 0;
        do {
            h = 0;
            f = 0;
            System.out.println("Masukkan p:");
            p = new Random().nextInt(3) + 1;
            if (p == 1) {
                t = 500000000;
                b = 60;
                ma = 10000000;
                mn = 50000000;
            } else if (p == 2) {
                t = 300000000;
                b = 48;
                ma = 7000000;
                mn = 3500000;
            } else {
                t = 150000000;
                b = 36;
                ma = 3000000;
                mn = 1500000;
            }
            System.out.println("Masukkan x:");
            x = new Random().nextInt(2) + 1;
            if (x == 1)
                D = mn;
            else
                D = ma;

            c = (t - D) / b;

            i = 1;
            do {
                System.out.println("Pada proses ke :"+i);
                d = new Random().nextInt(2) + 1;
                if (d == 1){
                    f = c * 0.2f;
                h = h + c + f;
                System.out.println("nilai h = "+h);
                i++;
                }
                else if (d == 2){
                    f = c * 0.015f;
                float h2 = h + c + f;
                System.out.println("nilai h di 2 = "+h2);
                i++;
                }
                a = 10;
            } while ((h <= (t - D)) && (i <= a));
            th = h;
            x = new Random().nextInt(2) + 1;
            // j++;
            if (x==1) {
                tertinggi = h;
                terendah = h;
                Iterbesar = i;
                Iterkecil = i;
            } else {
                if (h > tertinggi) {
                    tertinggi = h;
                    Iterbesar = i;
                } 
                if (h < terendah) {
                    terendah = h;
                    Iterkecil = i;
                }
            }
            System.out.println("h tertinggi ada pada i ke- "+Iterbesar+" dan nilai h nya adalah "+ tertinggi);
            System.out.println("h terendah ada pada i ke- :"+Iterkecil + " dan nilai h nya adalah "+ terendah);
        } while(x == 1);
    }
}
