/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author naimi
 */
public class policyandprecautions implements Serializable {
     private LocalDate dateofpolicy;
     private String policymessage;

    public policyandprecautions(LocalDate dateofpolicy, String policymessage) {
        this.dateofpolicy = dateofpolicy;
        this.policymessage = policymessage;
    }

    public LocalDate getDateofpolicy() {
        return dateofpolicy;
    }

    public void setDateofpolicy(LocalDate dateofpolicy) {
        this.dateofpolicy = dateofpolicy;
    }

    public String getPolicymessage() {
        return policymessage;
    }

    public void setPolicymessage(String policymessage) {
        this.policymessage = policymessage;
    }

    @Override
    public String toString() {
        return "Policyandprecautions{" + "Dateofpolicy=" + dateofpolicy + ", Policymessage=" + policymessage +  "}\n" ;
    }
     
     
}
