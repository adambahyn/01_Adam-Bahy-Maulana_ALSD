package Minggu_12.Tugas;

import java.util.Scanner;

public class AntrianMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian queue = new QueueAntrian();
        int pilihan;

        do {
            System.out.println("\n======= MENU ANTRIAN LAYANAN KEMAHASISWAAN =======");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Cek Antrian Kosong");
            System.out.println("5. Mengosongkan Antrian");
            System.out.println("6. Lihat Antrian Terdepan dan Terakhir");
            System.out.println("7. Tampilkan Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Keperluan: ");
                    String keperluan = sc.nextLine();
                    Mahasiswa m = new Mahasiswa(nim, nama, kelas, keperluan);
                    queue.enqueue(m);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println(queue.isEmpty() ? "Antrian kosong" : "Masih ada antrian");
                    break;
                case 5:
                    queue.clearQueue();
                    break;
                case 6:
                    queue.peekFrontAndRear();
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.size());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
