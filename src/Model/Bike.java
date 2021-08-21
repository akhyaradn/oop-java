/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author akhyar
 */
public class Bike {
    public static final String SPD_GUNUNG = "Sepeda Gunung";
    public static final String SPD_LIPAT = "Sepeda Lipat";
    private String kodeSepeda;
    private String namaSepeda;
    private String jenisSepeda;
    private Integer jumlahGigi;
    private Boolean aturTinggi;
    private Boolean lampu;
    private Integer stok;
           
    public Bike setKodeSepeda(String kodeSepeda)
    {
        this.kodeSepeda = kodeSepeda;
        return this;
        
    }
    
    public String getKodeSepeda()
    {
        return this.kodeSepeda;
    }
    
    public Bike setNamaSepeda(String namaSepeda)
    {
        this.namaSepeda = namaSepeda;
        return this;
    }
    
    public String getNamaSepeda()
    {
        return this.namaSepeda;
    }
    
    public Bike setJenisSepeda(String jenisSepeda)
    {
        this.jenisSepeda = jenisSepeda;
        return this;
    }
    
    public String getJenisSepeda()
    {
        return this.jenisSepeda;
    }
    public Bike setJumlahGigi(Integer jumlahGigi)
    {
        this.jumlahGigi = jumlahGigi;
        return this;
    }
    
    public Integer getJumlahGigi()
    {
        return this.jumlahGigi;
    }
    
    public Bike setAturTinggi(Boolean aturTinggi)
    {
        this.aturTinggi = aturTinggi;
        return this;
    }
    
    public Boolean getAturTinggi()
    {
        return this.aturTinggi;
    }
    
    public Bike setLampu(Boolean lampu)
    {
        this.lampu = lampu;
        return this;
    }
    
    public Boolean getLampu()
    {
        return this.lampu;
    }
    
    public Bike setStok(Integer stok)
    {
        this.stok = stok;
        return this;
    }
    
    public Integer getStok()
    {
        return this.stok;
    }
}
