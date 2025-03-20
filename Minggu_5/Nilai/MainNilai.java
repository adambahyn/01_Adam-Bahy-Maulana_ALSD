package Minggu_5.Nilai;

public class MainNilai {
    public static void main(String[] args) {
        Nilai[] n = new Nilai[8];

        n[0] = new Nilai("Ahmad", "220101001", "2022", 78, 82);
        n[1] = new Nilai("Budi", "220101002", "2022", 85, 88);
        n[2] = new Nilai("Cindy", "220101003", "2021", 90, 87);
        n[3] = new Nilai("Dian", "220101004", "2021", 76, 79);
        n[4] = new Nilai("Eko", "220101005", "2023", 92, 95);
        n[5] = new Nilai("Fajar", "220101006", "2020", 88, 85);
        n[6] = new Nilai("Gina", "220101007", "2023", 80, 83);
        n[7] = new Nilai("Hadi", "220101008", "2020", 82, 84);

        int[] nilai = new int[8];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = n[i].uts;
        }

        int tertinggi = n[0].tertinggi(nilai, 0, nilai.length - 1);
        int terendah = n[0].terendah(nilai, 0, nilai.length - 1);

        System.out.println("Nilai Tertinggi UTS : " + tertinggi);
        System.out.println("Nilai Terendah UTS : " + terendah);

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = n[i].uas;
        }

        double rata = n[0].rata(nilai);

        System.out.println("Nilai rata - rata UAS : " + rata);

    }
}
