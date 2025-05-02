package Minggu_8;

public class DataDosen {
    Dosen[] list = new Dosen[5];
    int idx;

    void tambah(Dosen list) {
        if (idx < this.list.length) {
            this.list[idx] = list;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataDosen() {
        System.out.println("=== DATA DOSEN ===");
        for (Dosen dosen : list) {
            dosen.tampilData();
        }
    }
}
