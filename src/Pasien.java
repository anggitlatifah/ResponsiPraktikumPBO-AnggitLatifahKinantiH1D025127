public class Pasien {
    private String nama;
    private int umur;
    private double biaya;

    private final String idPasien;

    public Pasien(){
        this("Tanpa Nama", 0);
    }

    public Pasien(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        this.biaya = 0;
        this.idPasien = "P-" + System.nanoTime();
    }

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return this.umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public double getBiaya(){
        return this.biaya;
    }
    public void setBiaya(double biaya){
        this.biaya = biaya;
    }
    public String getIdPasien(){
        return this.idPasien;
    }

    public void tampilkanInfo(){
        System.out.println("ID Pasien   : " + this.idPasien);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Umur        : " + this.umur + " tahun");
        System.out.println("Biaya Dasar : " + Rupiah.format(this.biaya));
    }

    //method fungsi mengembalikan nilai
    public double hitungBiayaTotal(){
        double biayaAdmin = this.biaya * 0.10;
        return this.biaya + biayaAdmin;
    }
}