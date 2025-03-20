
package MataKuliah2;
public class MataKuliahMain01 {
public static void main(String[] args) {
    MataKuliah01 matkul1 = new MataKuliah01();
    matkul1.kodeMK = "1A";
    matkul1.nama = "Dasar Pemrograman";
    matkul1.sks = 4;
    matkul1.jumlahJam = 4;

    matkul1.tampilInformasi();
    matkul1.ubahSKS(5);
    matkul1.tambahJam(1);
    matkul1.kurangiJam(2);
    System.out.println();
    matkul1.tampilInformasi();
    System.out.println();

    MataKuliah01 matkul2 = new MataKuliah01("1B", "Algoritma dan Struktur Data", 4, 4);

    matkul2.tampilInformasi();
    matkul2.ubahSKS(5);
    matkul2.tambahJam(1);
    matkul2.kurangiJam(2);
    System.out.println();
    matkul2.tampilInformasi();
    
}
    
}