/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Meytha Bethany
 */
public class FXMLDocumentController implements Initializable {
    
        @FXML
    private TextField nama;

    @FXML
    private TextField alamat;

    @FXML
    private TextField berat;

    @FXML
    private TextField no;

    @FXML
    private RadioButton ck;

    @FXML
    private ToggleGroup pilihan;

    @FXML
    private RadioButton cks;

    @FXML
    private RadioButton s;

    @FXML
    private TextField tanggal;

    @FXML
    private Button ok;

    @FXML
    private TextArea TA;

    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        double Berat = Double.parseDouble(berat.getText());
        int Nomor = Integer.parseInt(no.getText());
        String paket ="";
        String Tanggal = tanggal.getText();
        int harga=0;
        int hitung = Integer.parseInt(berat.getText());
        
        if (ck.isSelected())
        paket = "Cuci Kering";
        else if (cks.isSelected())
        paket = "Cuci Kering Setrika";
        else if (s.isSelected())
        paket = "Setrika";
        else 
        paket = "";
        
        if(! (ck.isSelected() || cks.isSelected() || s.isSelected()))
                JOptionPane.showMessageDialog(null, "Harap Pilih Paket Layanan");
        
        
        if (ck.isSelected())
        harga = hitung*5000;
        else if (cks.isSelected())
        harga = hitung * 8000;
        else if (s.isSelected())
        harga = hitung * 4000;
        
    
    
        TA.setText("Nama : "+Nama+"\nAlamat : "+Alamat+"\nBerat Cucian : "+Berat+"kg"+"\nPaket Laundry : "+paket+
                "\nHarga : "+harga+"\nTanggal Pengambilan : "+Tanggal);
    }

    @FXML
    private void hapus(ActionEvent event) {
        nama.setText("");
        alamat.setText("");
        berat.setText("");
        no.setText("");
        berat.setText("");
        TA.setText("");
        ck.setSelected(false);
        cks.setSelected(false);
        s.setSelected(false);
        
    }
    
}
