package Minggu_15.Array;

public class BinaryTree01 {
    Mahasiswa01[] dataMahasiswa;
    int idxLast;

    void populateData(Mahasiswa01 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); // Kiri
                dataMahasiswa[idxStart].tampilInformasi(); // Akar
                traverseInOrder(2 * idxStart + 2); // Kanan
            }
        }
    }

    void add(Mahasiswa01 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Tree penuh, tidak bisa menambah data.");
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi(); // Akar
                traversePreOrder(2 * idxStart + 1); // Kiri
                traversePreOrder(2 * idxStart + 2); // Kanan
            }
        }
    }

}
