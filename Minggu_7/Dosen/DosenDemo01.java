package Minggu_7.Dosen;

import java.util.Scanner;

public class DosenDemo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DataDosen01 data = new DataDosen01();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia (ASC - Bubble Sort)");
            System.out.println("4. Sorting Usia (DSC - Selection Sort)");
            System.out.println("5. Sorting Usia (DSC - Insertion Sort)");
            System.out.println("6. Cari Nama Dosen (Sequential Search)");
            System.out.println("7. Cari Dosen Berdasarkan Usia (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin (L = Laki-laki / P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Masukkan Usia: ");
                    int usia = sc.nextInt();
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');

                    data.tambah(new Dosen01(kode, nama, jenisKelamin, usia));
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC (Usia Muda ke Tua)!");
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda) dengan Selection Sort!");
                    break;

                case 5:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan DSC (Usia Tua ke Muda) dengan Insertion Sort!");
                    break;
                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    data.PencarianDataSequential01(cariNama);
                    break;

                case 7:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = sc.nextInt();
                    data.PencarianDataBinary(cariUsia);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }
}
