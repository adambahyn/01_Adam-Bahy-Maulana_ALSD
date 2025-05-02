package Minggu_10;

public class StackSurat01 {
    Surat01[] surat;
    int top;

    public StackSurat01(int size) {
        surat = new Surat01[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == surat.length) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return !true;
        }
    }

    public void push(Surat01 srt) {
        if (!isFull()) {
            top++;
            surat[top] = srt;

        } else {
            System.out.println("Stack penuh! Tidak bisa menyerahkan surat lagi!");
        }
    }

    public Surat01 pop() {
        if (!isEmpty()) {
            Surat01 s = surat[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat01 peek() {
        if (!isEmpty()) {
            return surat[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang diserahkan");
            return null;
        }
    }

    public Surat01 peekbottom() {
        if (!isEmpty()) {
            return surat[0];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang diserahkan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(surat[i].namaMahasiswa + "\t" + surat[i].kelas + "\t" + surat[i].jenisIzin + "\t"
                    + surat[i].durasi);
        }
        System.out.println();
    }

    public void cari(String cari) {
        boolean ditemukan = false;
        System.out.println("Surat:");
        System.out.println("Nama\tKelas\tJenis\tDurasi");
        for (int i = 0; i < surat.length; i++) {
            if (surat[i] != null && cari.equalsIgnoreCase(surat[i].namaMahasiswa)) {
                String keterangan = (surat[i].jenisIzin == 'S' || surat[i].jenisIzin == 's') ? "Sakit"
                        : (surat[i].jenisIzin == 'I' || surat[i].jenisIzin == 'i') ? "Izin" : "Lainnya";
                System.out.println(surat[i].namaMahasiswa + "\t" + surat[i].kelas + "\t" + keterangan + "\t"
                        + surat[i].durasi);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ada");
        }
    }
    

}
