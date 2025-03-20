import java.util.*;

public class pemilihan {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================");

        System.out.print("Masukkan nilai Tugas : ");
        int tugas = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan nilai Kuis : ");
        int kuis = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan nilai UTS : ");
        int uts = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan nilai UAS : ");
        int uas = sc.nextInt();
        sc.nextLine();
        System.out.println("============");
        System.out.println("============");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("=============");
            System.out.println("=============");

        } else {
            double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.30 * uas);
            String nilaiHuruf = null;
            Boolean lulus = false;
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                lulus = true;
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                lulus = true;
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                lulus = true;
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                lulus = true;
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                lulus = true;
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                lulus = false;
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                lulus = false;
            }

            System.out.println("nilai akhir : " + nilaiAkhir);
            System.out.println("nilai huruf : " + nilaiHuruf);
            System.out.println("============");
            System.out.println("============");
            if (lulus == true) {
                System.out.println("SELAMAT ANDA LULUS");
            } else { System.out.println("SELAMAT ANDA TIDAK LULUS");}

        }

    }

}