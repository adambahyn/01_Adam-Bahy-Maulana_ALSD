package Minggu_1;

import java.util.Scanner;

public class perulangan {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.print("Input NIM : ");
    long nim = sc.nextLong();
    sc.nextLine();

    int digit2 = (int)(nim % 100);

    if (digit2 < 10) {
        digit2 += 10;
    }

    System.out.println("n = " + digit2);
    for (int i = 1; i < digit2; i++) {
        if (i == 6 || i == 10) {
            continue;
        } else if (i % 2 == 0) {
            System.out.print(" " + i);
        } else { System.out.print(" *");}
        
    }
}

}