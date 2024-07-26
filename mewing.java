import java.text.DecimalFormat;
import java.util.Random;
public class mewing {

    public static void main(String[] args) throws InterruptedException {
    int p,a,x,b,i,d,lg;
    double t,c,D,h,f,th, ma,mn,thMax=0, hmax=0;
    int j=0, jmax=0;
    DecimalFormat formatDecimal = new DecimalFormat("#.##");
    Random in = new Random();
    do {
        System.out.println("Ke J = "+j);
        h=0;
        f=0;
        System.out.println("Masukkan p: ");
        p=in.nextInt(2)+1;
        System.out.print("P = "+p);
        if (p == 1) {
            t = 500000000;
            b=60;
            ma = 10000000;
            mn = 50000000;
        }else if (p == 2) {
            t = 300000000;
            b=48;
            ma = 7000000;
            mn = 3500000;
        }else {
            t = 150000000;
            b=36;
            ma = 3000000;
            mn = 1500000;
        }
            System.out.println();
            System.out.println("Masukkan x: ");
            x = in.nextInt(2)+1;
            if (x == 1) 
                D = mn;
            else
                D = ma;
            c = (t-D)/b;i=1;
            System.out.println("X = "+formatDecimal.format(x));
            System.out.println("c = "+formatDecimal.format(c));
            System.out.println("D = "+formatDecimal.format(D));
            System.out.println("t = "+formatDecimal.format(t));
            System.out.println("b = "+b);
            //Thread.sleep(1000);

    i =1;
        do {
            System.out.println("proses ke : "+i);
            d = in.nextInt(2)+1;
            if (d == 1)
                f = c * 02;
            else
                f = 0;
            h = h + c + f;
            i++;
            System.out.println("d = "+d);
            System.out.println("h = "+formatDecimal.format(h));
            System.out.println("f = "+formatDecimal.format(f));
            System.out.println("b = "+b);

            Thread.sleep(1000);
            if (h>=(t-D)) {
                System.out.println("h = (t-D)");
                break;
            }
        } while ((h<=(t-D)||(i<=b)));
            th = h;
            System.out.println("th = "+formatDecimal.format(th));
            if (th > thMax) {
                thMax = th;
                jmax = j;

            }
            if (h > hmax) {
                hmax = th;
                jmax = j;

            }
            lg = in.nextInt(2)+1; 
            System.out.println("lg = "+lg);
            j++;
        Thread.sleep(1000);

        }while(lg==1);
        System.out.println("th Maksimum diperoleh pada j ke-" + jmax + " dengan nilai th = " + formatDecimal.format(thMax));
        System.out.println("h Maksimum diperoleh pada j ke-" + jmax + " dengan nilai h = " + formatDecimal.format(thMax));
}
}
