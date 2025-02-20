public class fungsi {
    static String cabang[] = { "Royal Garden 1", "Royal Garden 2", "Royal Garden 3", "Royal Garden 4" };
    static String bunga[] = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int stok[][] = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
    static int harga[] = { 75000, 50000, 60000, 10000 };
    static int jumlah[] = new int[4];
    static int totalHarga[] = new int[4];

    public static void main(String[] args) {

        totalPendapatan();
        jumlahTersisa();
    }

    public static void totalPendapatan() {
        int totalHargaToko[] = new int[cabang.length];
        System.out.println("Jumlah Pendapatan Setiap Cabang : ");
        for (int i = 0; i < cabang.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < bunga.length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }
            totalHargaToko[i] = totalPendapatan;
            System.out.println(cabang[i] + " : Rp " + totalHargaToko[i]);
        }
    }

    public static void jumlahTersisa() {
        System.out.println();
        System.out.println("Jumlah Bunga Royal Garden 4 Yang Tersisa :");
        System.out.println("Aglonema : " + (stok[3][0] - 1));
        System.out.println("Keladi : " + (stok[3][1] - 2));
        System.out.println("Alocasia : " + (stok[3][2]));
        System.out.println("Mawar : " + (stok[3][3] - 5));
    }
}
