/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Bike;
import java.util.ArrayList;

/**
 *
 * @author akhyar
 */
public class BikeService {

    public Bike formatBike(
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
