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
    private String kodeSepeda;
    private String namaSepeda;
    private String jenisSepeda;
    private Integer jumlahGigi;
    private Boolean aturTinggi;
    private Boolean lampu;
    private Integer stok;
           
    public Bike setKodeSepeda(String kodeSepeda)
    {
        kodeSepeda = kodeSepeda;
        return this;
        
    }
    
    public String getKodeSepeda()
    {
        return kodeSepeda;
    }
    
    public Bike setNamaSepeda(String namaSepeda)
    {
        namaSepeda = namaSepeda;
        return this;
    }
    
    public String getNamaSepeda()
    {
        return namaSepeda;
    }
    
    public Bike setJenisSepeda(String jenisSepeda)
    {
        jenisSepeda = jenisSepeda;
        return this;
    }
    
    public String getJenisSepeda()
    {
        return jenisSepeda;
    }
    public Bike setJumlahGigi(Integer jumlahGigi)
    {
        jumlahGigi = jumlahGigi;
        return this;
    }
    
    public Integer getJumlahGigi()
    {
        return jumlahGigi;
    }
    
    public Bike setAturTinggi(Boolean aturTinggi)
    {
        aturTinggi = aturTinggi;
        return this;
    }
    
    public Boolean getAturTinggi()
    {
        return aturTinggi;
    }
    
    public Bike setLampu(Boolean lampu)
    {
        lampu = lampu;
        return this;
    }
    
    public Boolean getLampu()
    {
        return lampu;
    }
    
    public Bike setStok(Integer stok)
    {
        stok = stok;
        return this;
    }
    
    public Integer getStok()
    {
        return stok;
    }
}
