/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany;

import java.io.Serializable;

/**
 *
 * @author naimi
 */
public class CustomerService implements Serializable{
    private String reasonforleaveofabsensetextfield;
    private int numberofdaystextfield;

    public CustomerService(String reasonforleaveofabsensetextfield, int numberofdaystextfield) {
        this.reasonforleaveofabsensetextfield = reasonforleaveofabsensetextfield;
        this.numberofdaystextfield = numberofdaystextfield;
    }

    CustomerService(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getReasonforleaveofabsensetextfield() {
        return reasonforleaveofabsensetextfield;
    }

    public void setReasonforleaveofabsensetextfield(String reasonforleaveofabsensetextfield) {
        this.reasonforleaveofabsensetextfield = reasonforleaveofabsensetextfield;
    }

    public int getNumberofdaystextfield() {
        return numberofdaystextfield;
    }

    public void setNumberofdaystextfield(int numberofdaystextfield) {
        this.numberofdaystextfield = numberofdaystextfield;
    }

    @Override
    public String toString() {
        return "CustomerService{" + "reasonforleaveofabsensetextfield=" + reasonforleaveofabsensetextfield + ", numberofdaystextfield=" + numberofdaystextfield + '}';
    }

   
    
}
