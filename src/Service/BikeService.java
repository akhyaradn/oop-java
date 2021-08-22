/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Bike;
import java.util.ArrayList;
import Model.*;
import Repository.*;
import DBConnection.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhyar
 */
public class BikeService {
    
    Mysql dbc;
    
    public BikeService()
    {
        try {
            this.dbc = new Mysql("root", "password");        
            this.dbc.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getLatestBikeId(String type) 
    {        
        BikeRepository br = new BikeRepository(this.dbc);
        String prefix = type == Bike.SPD_GUNUNG ? "GN" : "LT";
        String id = "001";
        String s = br.getLatestBikeId(type);
        
        if(!s.equals("")) {
            String lastId = s.substring(Math.max(s.length() - 3, 0));
            String i = Integer.toString(Integer.parseInt(lastId) + 1);

            if(i.length() == 1) id = "00" + i;
            if(i.length() == 2) id = "0" + i;
            if(i.length() == 3) id = i;
        }

        return prefix + id;
    }
    
    public void insert(Bike bike)
    {
        BikeRepository br = new BikeRepository(this.dbc);
        br.insertBike(bike);
    }
    
    public void update(Bike bike, String query)
    {
        BikeRepository br = new BikeRepository(this.dbc);
        br.updateBike(bike, query);
    }
    
    public void delete(String id) 
    {
        BikeRepository br = new BikeRepository(this.dbc);
        br.deleteBike(id);
    }
    
    public Bike findBike(String id)
    {
        try {
            BikeRepository br = new BikeRepository(this.dbc);
            Bike bike = br.getSingleData("SELECT * FROM bike WHERE KodeSepeda = '"+ id +"'");
            return bike;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }        
    }
    
    public ArrayList getAll() 
    {
        try {
            String query = "SELECT * FROM bike";
            BikeRepository br = new BikeRepository(this.dbc);
            return br.getMultipleData(query);
        } catch(Exception e) {
            e.printStackTrace();
            return new ArrayList<Bike>();
        }
    }
    
    public DefaultTableModel tableData() 
    {
        ArrayList<Bike> bikes = this.getAll();        
        Object[] columnNames = {
            "Kode Sepeda",
            "Nama Sepeda",
            "Jenis Sepeda",
            "Jumlah Gigi",
            "Atur Tinggi",
            "Lampu",
            "Stok"
        };
        DefaultTableModel data = new DefaultTableModel();
        data.setColumnIdentifiers(columnNames);
        
        for(Bike bike : bikes) {
            Object[] t = {
                bike.getKodeSepeda(),
                bike.getNamaSepeda(),
                bike.getJenisSepeda(),
                bike.getJumlahGigi().toString(),
                bike.getAturTinggi().toString(),
                bike.getLampu().toString(),
                bike.getStok().toString()
            };
            
            data.addRow(t);
        }

        return data;
    }
    
    public String[] listOfIds()
    {        
        ArrayList<Bike> data = this.getAll();
        String[] ids = new String[data.size()];
        for(int i = 0; i < data.size(); i++) {
            ids[i] = data.get(i).getKodeSepeda();
        }
        
        return ids;
    }
    
    public Bike initObj(
        String kodeSepeda,
        String namaSepeda,
        String jenisSepeda,
        Integer jumlahGigi,
        Boolean aturTinggi,
        Boolean lampu,
        Integer stok
    ) {
        return new Bike()
            .setKodeSepeda(kodeSepeda)
            .setNamaSepeda(namaSepeda)
            .setJenisSepeda(jenisSepeda)
            .setJumlahGigi(jumlahGigi)
            .setAturTinggi(aturTinggi)
            .setKodeSepeda(kodeSepeda)
            .setLampu(lampu)
            .setStok(stok);
    }
}
