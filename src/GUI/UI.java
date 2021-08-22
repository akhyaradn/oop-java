/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Service.*;
import java.util.*;
import Model.*;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhyar
 */
public class UI extends javax.swing.JFrame implements ActionListener {
    /**
     * Creates new form Main
     */    
    private Container c;
    private JLabel title;
    private JTable table;
    private JScrollPane tableScroll;
    private JLabel kodeSepeda;
    private JTextField tKodeSepeda;
    private JComboBox cKodeSepeda;
    private JLabel namaSepeda;
    private JTextField tNamaSepeda;
    private JLabel jenisSepeda;
    private JRadioButton tJenisSepedaTrue;
    private JRadioButton tJenisSepedaFalse;
    private ButtonGroup bJenisSepeda;
    private JLabel jumlahGigi;
    private JTextField tJumlahGigi;
    private JLabel aturTinggi;
    private ButtonGroup bAturTinggi;
    private JRadioButton tAturTinggiTrue;
    private JRadioButton tAturTinggiFalse;
    private JLabel lampu;
    private ButtonGroup bLampu;
    private JRadioButton tLampuTrue;
    private JRadioButton tLampuFalse;
    private JLabel stok;
    private JTextField tStok;
    private JButton btnAdd;
    private JButton btnEdit;
    private JButton btnDelete;
    private JButton btnSave;
    private String idKodeSepeda;
    private Integer flag = 0;

    public UI() {
        setTitle("Toko Sepeda");
        setBounds(300, 90, 1200, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
  
        c = getContentPane();
        c.setLayout(null);
        
        title = new JLabel("Toko Sepeda");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(350, 10);
        c.add(title);
        
        //FORM
        kodeSepeda = new JLabel("Kode Sepeda");
        kodeSepeda.setFont(new Font("Arial", Font.PLAIN, 20));
        kodeSepeda.setSize(190, 20);
        kodeSepeda.setLocation(100, 100);
        c.add(kodeSepeda);
        
        tKodeSepeda = new JTextField();
        tKodeSepeda.setFont(new Font("Arial", Font.PLAIN, 15));
        tKodeSepeda.setSize(190, 20);
        tKodeSepeda.setLocation(300, 100);
        tKodeSepeda.setEnabled(false);
        c.add(tKodeSepeda);
        
        cKodeSepeda = new JComboBox();
        cKodeSepeda.setFont(new Font("Arial", Font.PLAIN, 15));
        cKodeSepeda.setSize(190, 20);
        cKodeSepeda.setLocation(300, 100);
        cKodeSepeda.setVisible(false);
        cKodeSepeda.addActionListener(this);
        c.add(cKodeSepeda);
        
        namaSepeda = new JLabel("Nama Sepeda");
        namaSepeda.setFont(new Font("Arial", Font.PLAIN, 20));
        namaSepeda.setSize(190, 20);
        namaSepeda.setLocation(100, 150);
        c.add(namaSepeda);
        
        tNamaSepeda = new JTextField();
        tNamaSepeda.setFont(new Font("Arial", Font.PLAIN, 15));
        tNamaSepeda.setSize(190, 20);
        tNamaSepeda.setLocation(300, 150);
        c.add(tNamaSepeda);
        
        jenisSepeda = new JLabel("Jenis Sepeda");
        jenisSepeda.setFont(new Font("Arial", Font.PLAIN, 20));
        jenisSepeda.setSize(190, 20);
        jenisSepeda.setLocation(100, 200);
        c.add(jenisSepeda);
        
        tJenisSepedaTrue = new JRadioButton("Sepeda Gunung");
        tJenisSepedaTrue.setFont(new Font("Arial", Font.PLAIN, 15));
        tJenisSepedaTrue.setSize(190, 20);
        tJenisSepedaTrue.setLocation(300, 200);
        tJenisSepedaTrue.setSelected(true);
        tJenisSepedaTrue.addActionListener(this);
        c.add(tJenisSepedaTrue);
        
        tJenisSepedaFalse = new JRadioButton("Sepeda Lipat");
        tJenisSepedaFalse.setFont(new Font("Arial", Font.PLAIN, 15));
        tJenisSepedaFalse.setSize(190, 20);
        tJenisSepedaFalse.setLocation(300, 220);
        tJenisSepedaFalse.setSelected(false);
        tJenisSepedaFalse.addActionListener(this);
        c.add(tJenisSepedaFalse);
        
        bJenisSepeda = new ButtonGroup();
        bJenisSepeda.add(tJenisSepedaTrue);
        bJenisSepeda.add(tJenisSepedaFalse);
        
        jumlahGigi = new JLabel("Jumlah Gigi");
        jumlahGigi.setFont(new Font("Arial", Font.PLAIN, 20));
        jumlahGigi.setSize(190, 20);
        jumlahGigi.setLocation(100, 250);
        c.add(jumlahGigi);
        
        tJumlahGigi = new JTextField();
        tJumlahGigi.setFont(new Font("Arial", Font.PLAIN, 15));
        tJumlahGigi.setSize(190, 20);
        tJumlahGigi.setLocation(300, 250);
        c.add(tJumlahGigi);
        
        aturTinggi = new JLabel("Atur Tinggi");
        aturTinggi.setFont(new Font("Arial", Font.PLAIN, 20));
        aturTinggi.setSize(190, 20);
        aturTinggi.setLocation(100, 300);
        c.add(aturTinggi);
        
        tAturTinggiTrue = new JRadioButton("True");
        tAturTinggiTrue.setFont(new Font("Arial", Font.PLAIN, 15));
        tAturTinggiTrue.setSelected(true);
        tAturTinggiTrue.setSize(100, 20);
        tAturTinggiTrue.setLocation(300, 300);
        c.add(tAturTinggiTrue);
        
        tAturTinggiFalse = new JRadioButton("False");
        tAturTinggiFalse.setFont(new Font("Arial", Font.PLAIN, 15));
        tAturTinggiFalse.setSelected(false);
        tAturTinggiFalse.setSize(100, 20);
        tAturTinggiFalse.setLocation(400, 300);
        c.add(tAturTinggiFalse);
        
        bAturTinggi = new ButtonGroup();
        bAturTinggi.add(tAturTinggiTrue);
        bAturTinggi.add(tAturTinggiFalse);
        
        lampu = new JLabel("Lampu");
        lampu.setFont(new Font("Arial", Font.PLAIN, 20));
        lampu.setSize(190, 20);
        lampu.setLocation(100, 350);
        c.add(lampu);
        
        tLampuTrue = new JRadioButton("True");
        tLampuTrue.setFont(new Font("Arial", Font.PLAIN, 15));
        tLampuTrue.setSelected(true);
        tLampuTrue.setSize(100, 20);
        tLampuTrue.setLocation(300, 350);
        tLampuTrue.setEnabled(false);
        c.add(tLampuTrue);
        
        tLampuFalse = new JRadioButton("False");
        tLampuFalse.setFont(new Font("Arial", Font.PLAIN, 15));
        tLampuFalse.setSelected(false);
        tLampuFalse.setSize(100, 20);
        tLampuFalse.setLocation(400, 350);
        tLampuFalse.setEnabled(false);
        c.add(tLampuFalse);
        
        bLampu = new ButtonGroup();
        bLampu.add(tLampuTrue);
        bLampu.add(tLampuFalse);
        
        stok = new JLabel("Stok");
        stok.setFont(new Font("Arial", Font.PLAIN, 20));
        stok.setSize(190, 20);
        stok.setLocation(100, 400);
        c.add(stok);
        
        tStok = new JTextField();
        tStok.setFont(new Font("Arial", Font.PLAIN, 15));
        tStok.setSize(190, 20);
        tStok.setLocation(300, 400);
        c.add(tStok);
        
        //Buttons
        btnAdd = new JButton("Add");
        btnAdd.setSize(190, 20);
        btnAdd.setLocation(700, 100);
        btnAdd.addActionListener(this);
        c.add(btnAdd);

        btnEdit = new JButton("Edit");
        btnEdit.setSize(190, 20);
        btnEdit.setLocation(700, 150);
        btnEdit.addActionListener(this);
        c.add(btnEdit);
        
        btnDelete = new JButton("Delete");
        btnDelete.setSize(190, 20);
        btnDelete.setLocation(700, 200);
        btnDelete.addActionListener(this);
        c.add(btnDelete);
        
        btnSave = new JButton("Submit");
        btnSave.setSize(100, 40);
        btnSave.setLocation(790, 400);
        btnSave.addActionListener(this);
        c.add(btnSave);
        
        //Table
        DefaultTableModel tableData = new BikeService().tableData();
        table = new JTable(tableData);
        tableScroll = new JScrollPane(table);
        tableScroll.setSize(1000, 300);
        tableScroll.setLocation(100, 450);
        c.add(tableScroll);

        BikeService bs = new BikeService();
        idKodeSepeda = bs.getLatestBikeId(Bike.SPD_GUNUNG);
        tKodeSepeda.setText(this.idKodeSepeda);
        
        setVisible(true);
    }
    
    private String validationString(JTextField t) throws Exception 
    {
        if(t.getText().equals("")) {
            throw new Exception("Input tidak boleh kosong");
        } else {
            return t.getText();
        }
    }
    
    public Integer validationInt(String s) throws Exception
    {
        try { 
            Integer i = Integer.parseInt(s); 
            return i;
        } catch(Exception e) { 
            throw new Exception("Input harus berupa angka");
        }
    }
    
    private Integer validationJumlahGigi(JTextField t) throws Exception 
    {
        String s = this.validationString(t);
        Integer i = this.validationInt(s);
        if(i >= 3 && i <= 7) {
            return i;
        } else {
            throw new Exception("Jumlah gigi 3 - 7");
        }
    }

    private void inputData() 
    {
        try {
            Bike b = new Bike().setKodeSepeda(this.idKodeSepeda)
                .setNamaSepeda(this.validationString(this.tNamaSepeda))
                .setJenisSepeda(this.tJenisSepedaTrue.isSelected() ? Bike.SPD_GUNUNG : Bike.SPD_LIPAT)
                .setJumlahGigi(this.validationJumlahGigi(this.tJumlahGigi))
                .setAturTinggi(this.tAturTinggiTrue.isSelected() ? true : false)
                .setLampu(this.tLampuTrue.isSelected() ? true : false)
                .setStok(this.validationInt(this.tStok.getText()));
            
            if(flag == 0) {
                new BikeService().insert(b);
                showMessageDialog(null, "Berhasil input data");
            } else if(flag == 1) {
                b.setKodeSepeda(cKodeSepeda.getSelectedItem().toString());
                new BikeService().update(b, "WHERE KodeSepeda = '"+b.getKodeSepeda()+"'");
                showMessageDialog(null, "Berhasil edit data");
            } else if(flag ==2) {
                b.setKodeSepeda(cKodeSepeda.getSelectedItem().toString());
                new BikeService().delete(b.getKodeSepeda());
                showMessageDialog(null, "Berhasil hapus data");
            }
            DefaultTableModel tableData = new BikeService().tableData();
            table.setModel(tableData);
            table.repaint();
            if(flag == 0) {
                this.resetForm();
            }
        } catch (Exception e) {
            showMessageDialog(null, e.getMessage());
        }
    }
    
    private void resetForm() 
    {
        idKodeSepeda = new BikeService().getLatestBikeId(Bike.SPD_GUNUNG);
        tKodeSepeda.setText(this.idKodeSepeda);
        tNamaSepeda.setText("");
        tJenisSepedaTrue.setSelected(true);
        tJumlahGigi.setText("");
        tAturTinggiTrue.setSelected(true);
        tLampuTrue.setSelected(true);
        tStok.setText("");
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == btnAdd) {
            this.tKodeSepeda.setVisible(true);
            this.tKodeSepeda.setEnabled(false);
            this.tNamaSepeda.setEnabled(true);
            this.tJenisSepedaTrue.setEnabled(true);
            this.tJenisSepedaFalse.setEnabled(true);
            this.tJumlahGigi.setEnabled(true);
            this.tAturTinggiTrue.setEnabled(true);
            this.tAturTinggiFalse.setEnabled(true);
            this.tStok.setEnabled(true);
            flag = 0;
        } else if (e.getSource() == btnEdit) {
            this.tKodeSepeda.setVisible(false);
            this.cKodeSepeda.setVisible(true);
            String[] data = new BikeService().listOfIds();
            this.cKodeSepeda.removeAllItems();
            for(int i = 0; i < data.length; i++) 
                this.cKodeSepeda.addItem(data[i]);
            this.tNamaSepeda.setEnabled(true);
            this.tJenisSepedaTrue.setEnabled(true);
            this.tJenisSepedaFalse.setEnabled(true);
            this.tJumlahGigi.setEnabled(true);
            this.tAturTinggiTrue.setEnabled(true);
            this.tAturTinggiFalse.setEnabled(true);
            this.tStok.setEnabled(true);
            flag = 1;
        } else if (e.getSource() == btnDelete) {
            this.tKodeSepeda.setVisible(false);
            this.cKodeSepeda.setVisible(true);
            String[] data = new BikeService().listOfIds();
            this.cKodeSepeda.removeAllItems();
            for(int i = 0; i < data.length; i++)
                this.cKodeSepeda.addItem(data[i]);
            this.tNamaSepeda.setEnabled(false);
            this.tJenisSepedaTrue.setEnabled(false);
            this.tJenisSepedaFalse.setEnabled(false);
            this.tJumlahGigi.setEnabled(false);
            this.tAturTinggiTrue.setEnabled(false);
            this.tAturTinggiFalse.setEnabled(false);
            this.tStok.setEnabled(false);
            flag = 2;
        } else if (e.getSource() == tJenisSepedaTrue){
            BikeService bs = new BikeService();
            this.idKodeSepeda = bs.getLatestBikeId(Bike.SPD_GUNUNG);
            this.tKodeSepeda.setText(this.idKodeSepeda);
            this.tLampuTrue.setSelected(true);
        } else if (e.getSource() == tJenisSepedaFalse){
            BikeService bs = new BikeService();
            this.idKodeSepeda = bs.getLatestBikeId(Bike.SPD_LIPAT);
            this.tKodeSepeda.setText(this.idKodeSepeda);
            this.tLampuFalse.setSelected(true);
        } else if(e.getSource() == cKodeSepeda) {
            String i = cKodeSepeda.getSelectedItem().toString();
            Bike bike = new BikeService().findBike(i);
            this.tNamaSepeda.setText(bike.getNamaSepeda());
            if(bike.getJenisSepeda() == Bike.SPD_GUNUNG) {
                this.tJenisSepedaTrue.setSelected(true);
            } else {
                this.tJenisSepedaFalse.setSelected(true);
            }
            this.tJumlahGigi.setText(bike.getJumlahGigi().toString());
            if(bike.getAturTinggi() == true) {
                this.tAturTinggiTrue.setSelected(true);
            } else {
                this.tAturTinggiFalse.setSelected(true);
            }
            if(bike.getLampu() == true) {
                this.tLampuTrue.setSelected(true);
            } else {
                this.tLampuFalse.setSelected(true);
            }
            this.tStok.setText(bike.getStok().toString());
        } else if (e.getSource() == btnSave) {
            this.inputData();
        }
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
