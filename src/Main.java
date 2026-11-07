import java.text.Format;

public class Main{
    public static void main(String[] args){
        System.out.println("=== SISTEM MANAJEMEN RUMAH SAKIT: " + TenagaMedis.NAMA_RS + " ===");
        System.out.println();

        Pelayanan layananDokter = new Dokter("Dr. Budi", "D-01", "Bedah");
        layananDokter.layaniPasien();

        Dokter dokter = (Dokter) layananDokter;
        dokter.setJamLembur(5);
        dokter.setJadwal("Senin 08.00 - 14.00");

        System.out.println();
        System.out.println("--- Data Dokter ---");
        dokter.tampilkanInfo();
        System.out.println("Gaji Dokter : " + Rupiah.format(dokter.hitungGaji()));

        System.out.println();
        System.out.println("--- Data Perawat ---");
        Perawat perawat = new Perawat("Ns. Ani", "P-01", "Pagi");
        perawat.tampilkanInfo();
        System.out.println("Gaji Perawat    : " + Rupiah.format(perawat.hitungGaji()));

        Pelayanan layananPerawat = perawat;
        layananPerawat.layaniPasien();

        System.out.println();
        System.out.println("--- Data Pasien ---");
        Pasien pasien = new Pasien("Siti", 30);
        pasien.setBiaya(500_000);
        pasien.tampilkanInfo();
        System.out.println("Total Biaya : " + Rupiah.format(pasien.hitungBiayaTotal()));

        //overloaded
        Pasien pasienKosong = new Pasien();
        System.out.println();
        System.out.println("--- Pasien Default (demo overloaded constructor) ---");
        pasienKosong.tampilkanInfo();

        System.out.println();
        System.out.println("=== Selesai ===");
    }
}