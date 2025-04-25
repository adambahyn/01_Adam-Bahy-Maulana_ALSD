public class Dosen {
    String nidn, namaDosen;

    Dosen(String nidn, String namaDosen) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }

    void tampilData() {
        System.out.printf("NIDN: %s\n", nidn);
        System.out.printf("Nama: %s\n\n", namaDosen);
    }

    public String getNama() {
        return namaDosen;
    }
}
