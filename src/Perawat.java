public class Perawat extends TenagaMedis implements Pelayanan{
    private String shift;
    public Perawat(String nama, String idTenagaMedis, String shift){
        super(nama, idTenagaMedis);
        this.shift = shift;
    }

    public String getShift(){
        return this.shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Shift           : " + this.shift);
    }

    @Override
    public double hitungGaji(){
        double gajiPokok;
        if(this.shift.equalsIgnoreCase("Pagi")){
            gajiPokok = 4_500_000;
        }else if(this.shift.equalsIgnoreCase("Malam")) {
            gajiPokok = 5_000_000;
        }else{
            gajiPokok = 4_000_000;
        }

        setGaji(gajiPokok);
        return gajiPokok;
    }

    @Override
    public void layaniPasien(){
        System.out.println("Perawat " + getNama() + " (shift " + this.shift + ") sedang melayani pasien.");
    }
}