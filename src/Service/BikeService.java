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

/**
 *
 * @author akhyar
 */
public class BikeService {
    
    Mysql dbc;
    
    public BikeService()
    {
        this.dbc = new Mysql("root", "password");        
    }

    public String getLatestBikeId(String type ) 
    {        
        try {
            this.dbc.connect();
            BikeRepository br = new BikeRepository(this.dbc);
            String query = "SELECT * FROM bike WHERE JenisSepeda = ";
            query += "'" + type + "'";
            query += " ORDER BY KodeSepeda DESC LIMIT 1";
            
            Bike bike = br.getSingleData(query);

            return bike.getKodeSepeda();
            
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
