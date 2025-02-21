public class MahasiswaMain01 {
    public static void main(String[] args) {
        Mahasiswa01 mhs1 = new Mahasiswa01();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}

