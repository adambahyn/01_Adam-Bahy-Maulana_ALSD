
package Minggu_8;
public class ListMatkul {
    MataKuliah[] listMatkul = new MataKuliah[7];
    int idx;
    void tambah(MataKuliah mataKuliah) {
        if (idx < this.listMatkul.length) {
            this.listMatkul[idx] = mataKuliah;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilDataMataKuliah() {
        System.out.println("=== DATA MATA KULIAH ===");
        for (MataKuliah mataKuliah : listMatkul) {
            System.out.printf("Kode MK\t\t: %s\n", mataKuliah.kodeMK);
            System.out.printf("Nama Mata Kuliah: %s\n", mataKuliah.namaMK);
            System.out.printf("SKS\t\t: %d\n", mataKuliah.sks);
            System.out.println();
        }
    }
}
