/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import DBConnection.*;
import java.util.ArrayList;
import java.sql.ResultSet;
import Model.*;
import java.sql.*;


/**
 *
 * @author akhyar
 */
public class BikeRepository {
    private ConnectionInterface con;    
    
    public BikeRepository(ConnectionInterface con)
    {
        this.con = con;
    }
    
    public ArrayList getMultipleData(String query) throws Exception
    {
        ArrayList<Bike> result = new ArrayList<Bike>();
        ResultSet rs = this.con.getStatement().executeQuery(query);
        while(rs.next()) {
            Bike b = this.formatBike(
                rs.getString("KodeSepeda"),
                rs.getString("NamaSepeda"),
                rs.getString("JenisSepeda"),
                rs.getInt("JumlahGigi"),
                rs.getBoolean("AturTinggi"),
                rs.getBoolean("lampu"),
                rs.getInt("stok")
            );
            result.add(b);
        }
        this.con.close();
        return result;
    }
    
    public Bike getSingleData(String query) throws Exception
    {
        ResultSet rs = this.con.getStatement().executeQuery(query);
        rs.next();
        Bike b = this.formatBike(
            rs.getString("KodeSepeda"),
            rs.getString("NamaSepeda"),
            rs.getString("JenisSepeda"),
            rs.getInt("JumlahGigi"),
            rs.getBoolean("AturTinggi"),
            rs.getBoolean("lampu"),
            rs.getInt("stok")
        );
        this.con.close();
        return b;
    }
    
    public void insertBike(Bike bike) throws Exception {
        String query = "INSERT INTO bike VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = this.con.getConnection().prepareStatement(query);

        ps.setString(1, bike.getKodeSepeda());
        ps.setString(2, bike.getNamaSepeda());
        ps.setString(3, bike.getJenisSepeda());
        ps.setInt(4, bike.getJumlahGigi());
        ps.setBoolean(5, bike.getAturTinggi());
        ps.setBoolean(1, bike.getLampu());
        ps.setInt(1, bike.getStok());

        ps.executeUpdate();
        this.con.close();
    }
    
    private Bike formatBike(
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
