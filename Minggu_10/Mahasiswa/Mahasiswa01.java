package Minggu_10.Mahasiswa;

public class Mahasiswa01 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa01() {
    }
    
    public Mahasiswa01(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;

    }
    
    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
