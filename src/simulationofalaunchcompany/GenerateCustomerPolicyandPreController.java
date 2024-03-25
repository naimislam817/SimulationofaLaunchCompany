/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class GenerateCustomerPolicyandPreController implements Initializable {

    @FXML
    private TextField generatePoliciestextfield;
    @FXML
    private TextField viewPoliciestextfield;
    @FXML
    private TextField writedateofpolicytextfield;
    @FXML
    private DatePicker dateofpolicyandprecaution;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void submitpoliciyButton(ActionEvent event) {
      File a = new File("Policyinfo.bin");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
 
        try {
            if (a.exists()) {
                fos = new FileOutputStream(a, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(a);
                oos = new ObjectOutputStream(fos);
            }
            policyandprecautions p = new policyandprecautions(
                    dateofpolicyandprecaution.getValue(),
                    generatePoliciestextfield.getText()
                 
                    
                    
                    
                    
                     
            );
            oos.writeObject(p);
            Alert b = new Alert(Alert.AlertType.INFORMATION);
            b.setTitle(" Alert");
            b.setHeaderText("Successful!!");
            b.setContentText("New Policy has been added successfully ");
            b.showAndWait();
 
        } catch (IOException ex) {
            Logger.getLogger(LatestCustomerDataController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(LatestCustomerDataController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
    }
    

    @FXML
    private void viewpolicyButton(ActionEvent event) {
     viewPoliciestextfield.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Policyinfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            policyandprecautions emp;
            try{
                viewPoliciestextfield.setText("");
                while(true){
                   
                    emp = (policyandprecautions)ois.readObject();
                    
                    viewPoliciestextfield.appendText(emp.toString());
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
    private void returntodashboardfromg2button(ActionEvent event) throws IOException {
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
