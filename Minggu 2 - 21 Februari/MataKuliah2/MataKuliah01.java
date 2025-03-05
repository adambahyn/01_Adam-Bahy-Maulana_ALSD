package MataKuliah2;
public class MataKuliah01 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah01() {
    }
    
    public MataKuliah01(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
    
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam > jam) {
            jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jam awal lebih kecil dari jam pengurang");
        }
        
    }
}
