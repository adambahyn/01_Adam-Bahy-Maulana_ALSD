import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'C', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[] kota = {"Banten", "Jakarta", "Bandung", "Cirebon", "Cirebon",
                         "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.println("Nama kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        scanner.close();
    }
}