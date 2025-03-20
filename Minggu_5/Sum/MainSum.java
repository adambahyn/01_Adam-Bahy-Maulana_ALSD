package Minggu_5.Sum;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();
        input.nextLine();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i + 1) + " : ");
            sm.keuntungan[i] = input.nextDouble();
            input.nextLine();
        }

        System.out.println("Total keuntungan menggunakan Brute Force " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide And Conquer " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
