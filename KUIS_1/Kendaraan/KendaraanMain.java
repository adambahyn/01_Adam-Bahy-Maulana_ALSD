package Kendaraan;


public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan[] n = new Kendaraan[10];
        double[] efisien = new double[10];

        for (int i = 0; i < n.length; i++) {
            n[i] = new Kendaraan();
            n[i].nomorPlat = "N" + (i);
            n[i].jarakTempuh = (i * 40 + 1);
            n[i].konsumsiBahanBakar = (i * 2 + 0.1);
            n[i].printData();
            efisien[i] = n[i].efisiensiBBM();
            System.out.println("Efisiensi BBM :" + efisien[i]);
            System.out.println("--------------");
        }
        int b = 0;
        for (int i = 0; i < n.length; i++) {
            double plgEfisien = Double.MAX_VALUE;
            if (plgEfisien > n[i].efisiensiBBM()) {
                plgEfisien = n[i].efisiensiBBM();
                b = i;
            }
        }

        int a = 0;
        for (int i = 0; i < efisien.length; i++) {
            if (efisien[i] > 10) {
                a++;
            }
        }

        System.out.println("Mobil Paling Efisien adalah :");
        n[b].printData();
        System.out.println("Efisiensi BBM :" + efisien[b]);
        System.out.println("------------");
        double persentase = a * 100/100;
        System.out.println("Persentase mobil efisisen (>10): " + persentase + " dari 10.0 Kendaraan");

    }
}
