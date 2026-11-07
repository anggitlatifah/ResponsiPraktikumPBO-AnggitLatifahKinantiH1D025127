public abstract class TenagaMedis {
    public static final String NAMA_RS = "RS Soedirman";    //immutability
    private String nama;
    private final String idTenagaMedis;                     //immutability
    private double gaji;

    public TenagaMedis(){                                   //Overloaded Constructor
        this("Tanpa Nama", "ID-000");
    }

    public TenagaMedis(String nama, String idTenagaMedis){  //Overloaded Constructor
        this.nama = nama;
        this.idTenagaMedis = idTenagaMedis;
        this.gaji = 0;
    }

    //getter & setter pakai this
    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getIdTenagaMedis(){
        return this.idTenagaMedis;
    }
    public double getGaji(){
        return this.gaji;
    }
    protected void setGaji(double gaji){
        this.gaji = gaji;
    }

    //method prosedur (void)
    public void tampilkanInfo(){
        System.out.println("ID: " + this.idTenagaMedis + " | Nama: " + this.nama);
    }

    //abstract method
    public abstract double hitungGaji();
}