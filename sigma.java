import java.util.Random;

public class sigma {
    public static void main(String[] args) throws InterruptedException{
        int p, a, x, b, i, d;
        float t, c, D, h, f, th;
        float ma, mn;
        int j = 0;
        do {
            System.out.println("J ke- " +j);
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
            System.out.println("p = "+ p);
            System.out.println("Masukkan x");
            x = new Random().nextInt(2) + 1;
            if (x == 1)
                D = mn;
            else
                D = ma;

            c = (t - D) / b;
            i = 1;
            do {
                System.out.println("Proses ke :" + i);
                d = new Random().nextInt(2) + 1;
                if (d == 1)
                    f = c * 0.2f;
                else
                    f = 0;
                h = c + f;
                i++;
                System.out.println("d = "+d);
                System.out.println("h = "+h);
                System.out.println("f = "+f);
                System.out.println("b = "+b);
                System.out.println("t-D = "+ (t-D));

                Thread.sleep(1000);

                if (h >= (t-D)) {
                    System.out.println("h = (t-D)");
                }
            } while ((h <= (t - D)) || (i <= b));
            th = h;
            System.out.println("th = "+th);
            x = new Random().nextInt(2) + 1;
            j++;
        } while(x == 1);
    }
}
