public class Jadwal {
    Dosen dosen;
    MataKuliah matakuliah;
    String hari;
    String jam;
    int jamjam;
    int kodeHari;

    public Jadwal(Dosen dosen, MataKuliah mataKuliah, String hari, String jam) {
        this.dosen = dosen;
        this.matakuliah = mataKuliah;
        this.hari = hari;
        if (this.hari.equalsIgnoreCase("Senin")) {
            kodeHari = 1;
        } else if (this.hari.equalsIgnoreCase("Selasa")) {
            kodeHari = 2;
        } else if (this.hari.equalsIgnoreCase("Rabu")) {
            kodeHari = 3;
        } else if (this.hari.equalsIgnoreCase("Kamis")) {
            kodeHari = 4;
        } else if (this.hari.equalsIgnoreCase("Jumat")) {
            kodeHari = 5;
        } else if (this.hari.equalsIgnoreCase("Sabtu")) {
            kodeHari = 6;
        } else if (this.hari.equalsIgnoreCase("Minggu")) {
            kodeHari = 7;
        } else {
            kodeHari = 0; // atau nilai default lain jika input tidak valid
        }
        try {
            String[] parts = jam.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            this.jamjam = hours * 60 + minutes;
        } catch (Exception e) {
            this.jamjam = 0; // nilai default jika format salah
            System.err.println("Format jam tidak valid: " + jam);
        }
        this.jam = jam;
    }

    public void tampilData() {
        System.out.printf("%s - %s | %s - %s%n", 
            this.hari, 
            this.jam, 
            this.dosen.namaDosen, 
            this.matakuliah.namaMK);
    }
}