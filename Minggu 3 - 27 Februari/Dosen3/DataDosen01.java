package Dosen3;

public class DataDosen01 {

    void dataSemuaDosen(Dosen01[] arrayDosen01) {
        int a = 1;
        for (Dosen01 dosen01 : arrayDosen01) {
            System.out.println("Data Dosen ke-" + a);
            dosen01.tampilDosen();
            a++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen01[] arrayDosen01) {
        int l = 0;
        int p = 0;
        for (Dosen01 dosen01 : arrayDosen01) {
            if (dosen01.jenisKelamin) {
                p++;
            } else {
                l++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + l);
        System.out.println("--------------------------");
        System.out.println("Jumlah Dosen Wanita : " + p);
        System.out.println("---------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen01[] arrayDosen01) {
        int l = 0;
        int usiaL = 0;
        int p = 0;
        int usiaP = 0;
        int a = 0;
        for (Dosen01 dosen01 : arrayDosen01) {
            if (dosen01.jenisKelamin) {
                p++;
                usiaP += dosen01.usia;
            } else {
                l++;
                usiaL += dosen01.usia;
            }
            a++;
        }
        System.out.println("Rata rata usia dosen pria : " + usiaL / l);
        System.out.println("------------------------");
        System.out.println("Rata rata usia dosen wanita : " + usiaP / p);
        System.out.println("--------------------------");
    }

    int infoDosenPalingTua(Dosen01[] arrayDosen01) {
        int tertua = 0;
        int index = 0;
        for (int i = 0; i < arrayDosen01.length; i++) {
            if (arrayDosen01[i].usia > tertua) {
                tertua = arrayDosen01[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Tua : " + tertua + " tahun");
        System.out.println("-------------------------");
        return index;
    }

    int infoDosenPalingMuda(Dosen01[] arrayDosen01) {
        int termuda = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arrayDosen01.length; i++) {
            if (arrayDosen01[i].usia < termuda) {
                termuda = arrayDosen01[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Muda : " + termuda + " tahun");
        System.out.println("---------------------------");
        return index;
    }
}
