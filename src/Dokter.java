public class Dokter extends TenagaMedis implements Pelayanan, Jadwal{
    private String spesialis;
    private int jamLembur;
    private String jadwal;

    public Dokter(String nama, String idTenagaMedis, String spesialis){
        super(nama, idTenagaMedis);
        this.spesialis = spesialis;
        this.jamLembur = 0;
        this.jadwal = "Belum diatur";
    }

    public String getSpesialis(){
        return this.spesialis;
    }
    public void setSesialis(String spesialis){
        this.spesialis = spesialis;
    }
    public int getJamLembur(){
        return this.jamLembur;
    }
    public void setJamLembur(int jamLembur){
        this.jamLembur = jamLembur;
    }

    //overriding
    @Override
    public void tampilkanInfo() {
        //super.namaMethod()
        super.tampilkanInfo();
        System.out.println("Spesialis   : " + this.spesialis);
        System.out.println("Jadwal      : " + this.jadwal);
    }

    @Override
    public double hitungGaji(){
        double gajiPokok;
        if(this.spesialis.equalsIgnoreCase("Bedah")){
            gajiPokok = 10_000_000;
        }else if(this.spesialis.equalsIgnoreCase("Anak")){
            gajiPokok = 10_000_000;
        }else{
            gajiPokok = 8_000_000;
        }

        double totalGaji = gajiPokok + (this.jamLembur * 200_000);
        setGaji(totalGaji);
        return totalGaji;
    }

    @Override
    public void layaniPasien(){
        System.out.println("Dokter " + getNama() + " (" + this.spesialis + ") sedang melayani pasien.");
    }

    @Override
    public String getJadwal(){
        return this.jadwal;
    }

    @Override
    public void setJadwal(String jadwal){
        this.jadwal = jadwal;
    }
}