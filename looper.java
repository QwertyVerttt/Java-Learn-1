import java.util.Random;
public class looper {
    public static void main(String[] args) {
        Random random = new Random();
        int j = 0;
        int x;

        int maxT = Integer.MIN_VALUE; // Inisialisasi maxT dengan nilai terkecil
        int minT = Integer.MAX_VALUE; // Inisialisasi minT dengan nilai terbesar
        int lacakMax = 0; // Inisialisasi untuk mencatat iterasi di mana maxT ditemukan
        int lacakMin = 0; // Inisialisasi untuk mencatat iterasi di mana minT ditemukan

        do {
            // Inisialisasi variabel
            int t;
            int b;
            int ma;
            int mn;

            int p = random.nextInt(3) + 1;
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

            // Penentuan nilai D
            x = random.nextInt(2) + 1;
            int D = (x == 1) ? mn : ma;

            // Proses perhitungan
            float c = (float)(t - D) / b;
            float h = 0;
            float f = 0;
            int i = 1;
            do {
                System.out.println("Proses ke :" + i);
                int d = random.nextInt(2) + 1;
                if (d == 1) {
                    f = c * 0.2f;
                }
                h = c + f;
                i++;
            } while ((h <= (t - D)) && (i <= b));

            // Update nilai maxT dan minT serta iterasi di mana ditemukan
            if (t > maxT) {
                maxT = t;
                lacakMax = j;
            }
            if (t < minT) {
                minT = t;
                lacakMin = j;
            }

            j++;
        } while (x == 1);

        System.out.println("Nilai t terbesar: " + maxT + " ditemukan pada iterasi j ke-" + lacakMax);
        System.out.println("Nilai t terkecil: " + minT + " ditemukan pada iterasi j ke-" + lacakMin);
    }
}