package Minggu_12.Tugas;

public class Mahasiswa {
    String nim, nama, kelas, keperluan;

    public Mahasiswa(String nim, String nama, String kelas, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.keperluan = keperluan;
    }

    void tampil() {
        System.out.println("[" + nama + " | " + nim + " | " + kelas + " | " + keperluan + "]");
    }
}
