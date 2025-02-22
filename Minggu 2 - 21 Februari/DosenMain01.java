public class DosenMain01 {
    public static void main(String[] args) {
        int tahun = 2025;

        Dosen01 dosen1 = new Dosen01();
        dosen1.idDosen = "1A";
        dosen1.nama = "Adam";
        dosen1.bidangKeahlian = "Matematika";
        dosen1.tahunBergabung = 2024;

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Lama Tahun Kerja " + dosen1.nama + " : " + dosen1.hitungMasaKerja(tahun));
        dosen1.ubahKeahlian("Komputer");
        System.out.println();
        dosen1.tampilInformasi();
        System.out.println();

        Dosen01 dosen2 = new Dosen01("2A", "Tiara", "Komputer", 2022);

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        System.out.println("Lama Tahun Kerja " + dosen2.nama + " : " + dosen2.hitungMasaKerja(tahun));
        dosen2.ubahKeahlian("Matematika");
        System.out.println();
        dosen2.tampilInformasi();
    }
}
