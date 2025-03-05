package Mahasiswa3;

import java.util.*;

public class MahasiswaDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        Mahasiswa01[] arrayOfMahasiswa01 = new Mahasiswa01[3];
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa01[i] = new Mahasiswa01();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa01[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayOfMahasiswa01[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa01[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa01[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa01[i].cetakInfo();
        }

        // arrayOfMahasiswa01[0] = new Mahasiswa01();
        // arrayOfMahasiswa01[0].nim = "244107060033";
        // arrayOfMahasiswa01[0].nama = "AGNES TITANIA KINANTI";
        // arrayOfMahasiswa01[0].kelas = "SIB-1E";
        // arrayOfMahasiswa01[0].ipk = (float) 3.75;

        // arrayOfMahasiswa01[1] = new Mahasiswa01();
        // arrayOfMahasiswa01[1].nim = "2341720172";
        // arrayOfMahasiswa01[1].nama = "ACHMAD MAULANA HAMZAH";
        // arrayOfMahasiswa01[1].kelas = "TI-2A";
        // arrayOfMahasiswa01[1].ipk = (float) 3.36;

        // arrayOfMahasiswa01[2] = new Mahasiswa01();
        // arrayOfMahasiswa01[2].nim = "244107023006";
        // arrayOfMahasiswa01[2].nama = "DIRHAMAWAN PUTRANTO";
        // arrayOfMahasiswa01[2].kelas = "TI-2E";
        // arrayOfMahasiswa01[2].ipk = (float) 3.80;

        // System.out.println("NIM : " + arrayOfMahasiswa01[0].nim);
        // System.out.println("Nama : " + arrayOfMahasiswa01[0].nama);
        // System.out.println("Kelas : " + arrayOfMahasiswa01[0].kelas);
        // System.out.println("IPK : " + arrayOfMahasiswa01[0].ipk);
        // System.out.println("--------------------------");
        // System.out.println("NIM : " + arrayOfMahasiswa01[1].nim);
        // System.out.println("Nama : " + arrayOfMahasiswa01[1].nama);
        // System.out.println("Kelas : " + arrayOfMahasiswa01[1].kelas);
        // System.out.println("IPK : " + arrayOfMahasiswa01[1].ipk);
        // System.out.println("--------------------------");
        // System.out.println("NIM : " + arrayOfMahasiswa01[2].nim);
        // System.out.println("Nama : " + arrayOfMahasiswa01[2].nama);
        // System.out.println("Kelas : " + arrayOfMahasiswa01[2].kelas);
        // System.out.println("IPK : " + arrayOfMahasiswa01[2].ipk);
    }
}
