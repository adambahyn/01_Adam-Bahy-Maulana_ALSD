package Minggu_7.Mahasiswa;

import java.util.Scanner;

public class MahasiswaDemo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            Double ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }
        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan data IPK yang dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        // System.out.println("Menggunakan Sequential Searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("Menggunakan Binary Searching");
        double posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
        // ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)
        // : ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DESC)
        // : ");
        // list.insertionSort();
        // list.tampil();
    }
}
