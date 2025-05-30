package Minggu_13.Mahasiswa;

public class Mahasiswa01 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa01() {
    }
    
    public Mahasiswa01(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
    
    
}
