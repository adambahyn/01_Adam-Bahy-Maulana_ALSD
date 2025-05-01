public class JadwalDosen {
    Jadwal[] listJadwal = new Jadwal[100];
    int idx;

    public void tambahJadwal(Jadwal jadwal) {
        if (idx < this.listJadwal.length) {
            this.listJadwal[idx] = jadwal;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                // Prioritaskan sorting berdasarkan hari dulu
                if (listJadwal[j].kodeHari > listJadwal[j + 1].kodeHari) {
                    // Swap jika hari lebih besar
                    Jadwal temp = listJadwal[j];
                    listJadwal[j] = listJadwal[j + 1];
                    listJadwal[j + 1] = temp;
                }
                // Jika hari sama, bandingkan jam
                else if (listJadwal[j].kodeHari == listJadwal[j + 1].kodeHari) {
                    if (listJadwal[j].jamjam > listJadwal[j + 1].jamjam) {
                        // Swap jika jam lebih besar
                        Jadwal temp = listJadwal[j];
                        listJadwal[j] = listJadwal[j + 1];
                        listJadwal[j + 1] = temp;
                    }
                }
            }
        }
    }

    public int jadwalSama(int posisi) {
        // Prioritaskan sorting berdasarkan hari dulu
        if (listJadwal[posisi].kodeHari == listJadwal[posisi + 1].kodeHari) {
            for (int j = posisi; j < idx; j++) {
                if (listJadwal[j].jamjam == listJadwal[j + 1].jamjam) {
                    return j;
                }
            }
        } 
        return -1;
    }

    void selectionSortASC() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listJadwal[j].kodeHari < listJadwal[minIndex].kodeHari ||
                        (listJadwal[j].kodeHari == listJadwal[minIndex].kodeHari &&
                                listJadwal[j].jamjam < listJadwal[minIndex].jamjam)) {
                    minIndex = j;
                }
            }
            // Swap
            Jadwal temp = listJadwal[minIndex];
            listJadwal[minIndex] = listJadwal[i];
            listJadwal[i] = temp;
        }
    }

    void insertionSortASC() {
        for (int i = 1; i < idx; i++) {
            Jadwal temp = listJadwal[i];
            int j = i - 1;

            // Bandingkan kodeHari dan jamjam
            while (j >= 0 &&
                    (listJadwal[j].kodeHari > temp.kodeHari ||
                            (listJadwal[j].kodeHari == temp.kodeHari && listJadwal[j].jamjam > temp.jamjam))) {
                listJadwal[j + 1] = listJadwal[j];
                j--;
            }

            listJadwal[j + 1] = temp;
        }
    }

    void sortByNamaDosenASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listJadwal[j].dosen.namaDosen.compareToIgnoreCase(listJadwal[j + 1].dosen.namaDosen) > 0) {
                    Jadwal temp = listJadwal[j];
                    listJadwal[j] = listJadwal[j + 1];
                    listJadwal[j + 1] = temp;
                }
            }
        }
    }

    public void tampilJadwal() {
        for (int i = 0; i < idx; i++) {
            listJadwal[i].tampilData();
        }
        System.out.println();
    }

    void tampilDataJadwal() {
        System.out.println("=== DATA JADWAL KULIAH ===");
        for (Jadwal jadwal : listJadwal) {
            System.out.printf("Dosen\t\t: %s\n", jadwal.dosen.namaDosen);
            System.out.printf("Mata Kuliah\t: %s\n", jadwal.matakuliah.namaMK);
            System.out.printf("SKS\t\t: %s\n", jadwal.matakuliah.sks);
            System.out.printf("Hari\t\t: %s\n", jadwal.hari);
            System.out.printf("Jam\t\t: %s\n", jadwal.jam);
            System.out.println();
        }
    }

    public int sequentialSearching(String cari) {
        int posisi = -1;
        for (int j = 0; j < listJadwal.length; j++) {
            if (listJadwal[j].dosen.namaDosen.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int binarySearch(String cari) {
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = listJadwal[mid].dosen.namaDosen.compareToIgnoreCase(cari);

            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    void tampilDataPencarian(int posisi) {
        if (posisi != -1) {
            System.out.printf("Dosen: %s\n", listJadwal[posisi].dosen.namaDosen);
            System.out.printf("Mata Kuliah: %s\n", listJadwal[posisi].matakuliah.namaMK);
            System.out.printf("Hari: %s\n", listJadwal[posisi].hari);
            System.out.printf("Jam: %s\n\n", listJadwal[posisi].jam);
        }
    }
}