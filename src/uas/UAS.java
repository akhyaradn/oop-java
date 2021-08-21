/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import Repository.*;
import DBConnection.*;
import Service.*;
import Model.*;
import java.util.ArrayList;
/**
 *
 * @author akhyar
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BikeService bService = new BikeService();
        System.out.println(bService.getLatestBikeId(Bike.SPD_LIPAT));
//            Mysql dbc = new Mysql("root", "password");
//            dbc.connect();
//            BikeRepository br = new BikeRepository(dbc);
//            ArrayList<Bike> data = br.getMultipleData("SELECT * FROM bike");
//
//            for(Bike bike : data) {
//                System.out.println(bike.getNamaSepeda());
//            }
    }
    
}
