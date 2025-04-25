public class DataDosen {
    Dosen[] list = new Dosen[100];
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

    public Dosen cariByNama(String nama) {
        for (int i = 0; i < idx; i++) {
            if (list[i].getNama().equalsIgnoreCase(nama)) {
                return list[i];
            }
        }
        return null;
    }
}
