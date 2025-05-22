package Minggu_12.Mahasiswa;

import java.util.Scanner;

public class SLLMain01 {
    public static void main(String[] args) {
        int input;
        SingleLinkedList01 sll = new SingleLinkedList01();
        Mahasiswa01 mhs1 = new Mahasiswa01("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa01 mhs2 = new Mahasiswa01("23212201", "Bimon", "2B", 3.8);
        Mahasiswa01 mhs3 = new Mahasiswa01("22212202", "Cintia", "3C", 3.5);
        Mahasiswa01 mhs4 = new Mahasiswa01("21212203", "Dirga", "4D", 3.6);
        //     do {
        //         System.out.println();
        //         System.out.println("1. Daftar Linked List");
        //         System.out.println("2. Tambah Mahasiswa Paling Depan");
        //         System.out.println("3. Tambah Mahasiswa Paling Belakang");
        //         System.out.println("4. Tambah Mahasiswa Sesuai Index");
        //         System.out.println("5. Tambah Mahasiswa Setelah Key");
        //         System.out.print("Masukkan Menu : ");
        //         Scanner sc = new Scanner(System.in);
        //         input = sc.nextInt();
        //         sc.nextLine();
        //         switch (input) {
        //             case 1:
        //                 System.out.println("Daftar Linked List: ");
        //                 sll.print();
        //                 break;
        //             case 2:
        //                 System.out.println("Tambah data mahasiswa paling depan: ");
        //                 System.out.print("Nim : ");
        //                 String nim = sc.nextLine();
        //                 System.out.print("Nama : ");
        //                 String nama = sc.nextLine();
        //                 System.out.print("Kelas : ");
        //                 String kelas = sc.nextLine();
        //                 System.out.print("IPK : ");
        //                 double ipk = sc.nextDouble();
        //                 sc.nextLine();
        //                 Mahasiswa01 mhsdepan = new Mahasiswa01(nim, nama, kelas, ipk);
        //                 sll.addFirst(mhsdepan);
        //                 break;
        //             case 3:
        //                 System.out.println("Tambah data mahasiswa paling belakang: ");
        //                 System.out.print("Nim : ");
        //                 String nim2 = sc.nextLine();
        //                 System.out.print("Nama : ");
        //                 String nama2 = sc.nextLine();
        //                 System.out.print("Kelas : ");
        //                 String kelas2 = sc.nextLine();
        //                 System.out.print("IPK : ");
        //                 double ipk2 = sc.nextDouble();
        //                 sc.nextLine();
        //                 Mahasiswa01 mhsbelakang = new Mahasiswa01(nim2, nama2, kelas2, ipk2);
        //                 sll.addLast(mhsbelakang);
        //                 break;
        //             case 4:
        //                 System.out.println("Tambah data mahasiswa sesuai index: ");
        //                 System.out.print("Nim : ");
        //                 String nim3 = sc.nextLine();
        //                 System.out.print("Nama : ");
        //                 String nama3 = sc.nextLine();
        //                 System.out.print("Kelas : ");
        //                 String kelas3 = sc.nextLine();
        //                 System.out.print("IPK : ");
        //                 double ipk3 = sc.nextDouble();
        //                 sc.nextLine();
        //                 System.out.print("Indeks ke - ");
        //                 int index = sc.nextInt();
        //                 sc.nextLine();
        //                 Mahasiswa01 mhsindex = new Mahasiswa01(nim3, nama3, kelas3, ipk3);
        //                 sll.insertAt(index, mhsindex);
        //                 break;
        //             case 5:
        //                 System.out.println("Tambah data mahasiswa setelah key: ");
        //                 System.out.print("Nim : ");
        //                 String nim4 = sc.nextLine();
        //                 System.out.print("Nama : ");
        //                 String nama4 = sc.nextLine();
        //                 System.out.print("Kelas : ");
        //                 String kelas4 = sc.nextLine();
        //                 System.out.print("IPK : ");
        //                 double ipk4 = sc.nextDouble();
        //                 sc.nextLine();
        //                 System.out.print("Masukkan setelah nama : ");
        //                 String key = sc.nextLine();
        //                 Mahasiswa01 mhsafter = new Mahasiswa01(nim4, nama4, kelas4, ipk4);
        //                 sll.insertAfter(key, mhsafter);
        //                 break;
        //             default:
        //                 break;
        //         }
        //     } while (input > 0);
        // }

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1 :");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
