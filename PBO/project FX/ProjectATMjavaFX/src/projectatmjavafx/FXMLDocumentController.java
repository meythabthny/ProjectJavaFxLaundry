/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatmjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Meytha Bethany
 */
public class FXMLDocumentController implements Initializable {
    String pins = "";
    String PIN = "1234";
    int tmp;
    int kesempatan = 3;
    
    @FXML
    private Label label;

    @FXML
    private JFXPasswordField pin;

    @FXML
    private JFXButton satu;

    @FXML
    private JFXButton dua;

    @FXML
    private JFXButton tiga;

    @FXML
    private JFXButton empat;

    @FXML
    private JFXButton lima;

    @FXML
    private JFXButton enam;

    @FXML
    private JFXButton tujuh;

    @FXML
    private JFXButton delapan;

    @FXML
    private JFXButton sembilan;

    @FXML
    private JFXButton c;

    @FXML
    private JFXButton nol;

    @FXML
    private JFXButton ok;
    
    @FXML
    void but0(ActionEvent event) {
        pins += "0";
        pin.setText(pins);
    }

    @FXML
    void but1(ActionEvent event) {
        pins += "1";
        pin.setText(pins);
    }

    @FXML
    void but2(ActionEvent event) {
        pins += "2";
        pin.setText(pins);
    }

    @FXML
    void but3(ActionEvent event) {
        pins += "3";
        pin.setText(pins);
    }

    @FXML
    void but4(ActionEvent event) {
        pins += "4";
        pin.setText(pins);
    }

    @FXML
    void but5(ActionEvent event) {
        pins += "5";
        pin.setText(pins);
    }

    @FXML
    void but6(ActionEvent event) {
        pins += "6";
        pin.setText(pins);
    }

    @FXML
    void but7(ActionEvent event) {
        pins += "7";
        pin.setText(pins);
    }

    @FXML
    void but8(ActionEvent event) {
        pins += "8";
        pin.setText(pins);
    }

    @FXML
    void but9(ActionEvent event) {
        pins += "9";
        pin.setText(pins);
    }

    @FXML
    void butc(ActionEvent event) {
        pins += "";
        pin.setText(pins);
    }

    @FXML
    void proses(ActionEvent event) {
        if(pins.equals(PIN)){
            try{    
                ((Node)(event.getSource())).getScene().getWindow().hide();
                FXMLLoader fxml =  new FXMLLoader();
                fxml.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene(fxml.load(), 830, 450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }catch(Exception e){
                System.out.println("Failed to create new window"+e);
            }       
            }else{
                kesempatan -= 1;
                JOptionPane.showMessageDialog(null, "PIN salah \n Tersisa"+kesempatan+"Kesempatan lagi");
                pin.setText("");
                pins="";
                if(kesempatan == 0){
                System.exit(0);
                }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void FXMLLoader() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
