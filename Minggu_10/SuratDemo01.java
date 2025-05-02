package Minggu_10;

import java.util.*;

public class SuratDemo01 {
    public static void main(String[] args) {
        StackSurat01 surat = new StackSurat01(10);
        int pilih;
        int idSurat = 1;
        String jenis;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin(S: Sakit, I: Izin, L:lainnya): ");
                    jenis = scan.nextLine();
                    char jenisIzin = jenis.charAt(0);
                    System.out.print("Durasi(hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat01 srt = new Surat01(String.valueOf(idSurat), namaMahasiswa, kelas, jenisIzin, durasi);
                    surat.push(srt);
                    idSurat++;
                    System.out.printf("Surat izin %s berhasil diserahkan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat01 diproses = surat.pop();
                    if (diproses != null) {
                        System.out.println("Verifikasi surat izin dari " + diproses.namaMahasiswa + " ?");
                        System.out.print("y / n : ");
                        char verif = scan.nextLine().toLowerCase().charAt(0); // aman dari huruf kapital
                        String keterangan = (diproses.jenisIzin == 'S' || diproses.jenisIzin == 's') ? "Sakit"
                                : (diproses.jenisIzin == 'I' || diproses.jenisIzin == 'i') ? "Izin" : "Lainnya";

                        if (verif == 'y') {
                            System.out.println("Surat dari " + diproses.namaMahasiswa +
                                    " dengan jenis izin " + keterangan + " DITERIMA.");

                        } else if (verif == 'n') {
                            System.out.println("Surat dari " + diproses.namaMahasiswa +
                                    " dengan jenis izin " + keterangan + " TIDAK DITERIMA.");
                        }
                    }
                    break;

                case 3:
                    Surat01 peektop = surat.peek();
                    if (peektop != null) {
                        System.out.println("Surat yang terakhir diserahkan oleh: " + peektop.namaMahasiswa);
                    }

                    break;
                case 4:
                    System.out.print("Cari surat atas nama: ");
                    String cari = scan.nextLine();
                    surat.cari(cari);
                    break;

                default:
                    System.out.println("Pilihan Tidak Valid.");
                    break;
            }

        } while (pilih != 0);
    }
}
