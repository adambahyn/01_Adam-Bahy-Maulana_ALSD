package Minggu_13.Mahasiswa;

import java.util.Scanner;

public class DLLMain {
    static Scanner scan = new Scanner(System.in);

    public static Mahasiswa01 inputMahasiswa() {
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        Mahasiswa01 mhs = new Mahasiswa01(nim, nama, kelas, ipk);
        return mhs;

    }

    public static void main(String[] args) {
        DoubleLinkedList01 list = new DoubleLinkedList01();
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            // System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: {
                    Mahasiswa01 mhs = inputMahasiswa();
                    list.addFirst(mhs);
                    break;
                }
                case 2: {
                    Mahasiswa01 mhs = inputMahasiswa();
                    list.addLast(mhs);
                    break;
                }
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                    list.removeLast();
                    break;
                case 5:
                    list.print();
                    break;
                // case 6:
                // System.out.print("Masukkan NIM yang dicari: ");
                // String nim = scan.nextLine();
                // NodeMahasiswa01 found = list.search(nim);
                // if (found != null) {
                // System.out.println("Data ditemukan:");
                // found.data.tampilInformasi();
                // } else {
                // System.out.println("Data tidak ditemukan.");
                // }
                // break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);

    }

}
