/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author naimi
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField userIdTxt;
    @FXML
    private TextField passwordTxt;
    @FXML
    private ComboBox<String> userComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         userComboBox.getItems().addAll("HR","Customer Service");
    }    

    @FXML
    private void Loginonclick(MouseEvent event) throws IOException {
    if(userComboBox.getValue().toString()=="HR"){
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("HumanResourceDash.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
            stg2.setScene(scene2);
            stg2.show();
        }
        else if(userComboBox.getValue().toString()=="Customer Service"){
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("CustomerServiceDash.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
            stg2.setScene(scene2);
            stg2.show();
        }
    }
    
}
