package Kendaraan;

public class Kendaraan {
    public String nomorPlat;
    public double jarakTempuh;
    public double konsumsiBahanBakar;

    public Kendaraan(){}

    double efisiensiBBM() {
        double efisiensiBBM = jarakTempuh / konsumsiBahanBakar;
        return efisiensiBBM;
    }
    
    void printData() {
        System.out.println("Data Kendaraan");
        System.out.println("Nomor Plat : " + nomorPlat);
        System.out.println("jarak Tempuh : " + jarakTempuh);
        System.out.println("Konsumsi Bahan Bakar : " + konsumsiBahanBakar);
    }
    

}
