package Tugas;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue antrian = new queue(10);
        int pilihan;
        do {

            System.out.println("\n== Menu Antrian Kartu Rencana Studi ==");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Memanggil Antrian");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    ;
                    break;
                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    Mahasiswa dilayani2 = antrian.layaniMahasiswa();
                    if (dilayani2 != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani2.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println(
                            "Jumlah Mahasiswa yang Belum Melakukan Proses KRS : " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pillhan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
