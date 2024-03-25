/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naimi
 */
public class GeneralNoticeViewbyCSController implements Initializable {

    @FXML
    private TextField generalnoticeoutputtextfield;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewnoticefieldbutton(ActionEvent event) {
    generalnoticeoutputtextfield.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("GeneralNoticeInfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            HRM emp;
            try{
                generalnoticeoutputtextfield.setText("");
                while(true){
                   
                    emp = (HRM)ois.readObject();
                    
                    generalnoticeoutputtextfield.appendText(emp.toString());
                }
            }
            catch(Exception e){
                //
            }     
          //  viewTextField.appendText(" \n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }        
       
    }

    @FXML
    private void returntocustomerservicedash(ActionEvent event) throws IOException {
    Parent scene2;
        scene2 = FXMLLoader.load(getClass().getResource("CustomerServiceDash.fxml"));
        Scene scene3 = new Scene(scene2);
        //Stage window = new Stage();
        //s2.setScene(scene2);  s2.show();
               
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene3);
        window.show();
    }
    
}
