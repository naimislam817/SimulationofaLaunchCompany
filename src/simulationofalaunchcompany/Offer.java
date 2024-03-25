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
public class Offer implements Serializable {
    private String comboboxroute;
    private String comboboxpercentage;

    public Offer(String comboboxroute, String comboboxpercentage) {
        this.comboboxroute = comboboxroute;
        this.comboboxpercentage = comboboxpercentage;
    }

    Offer(String text, String value, String value0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getComboboxroute() {
        return comboboxroute;
    }

    public void setComboboxroute(String comboboxroute) {
        this.comboboxroute = comboboxroute;
    }

    public String getComboboxpercentage() {
        return comboboxpercentage;
    }

    public void setComboboxpercentage(String comboboxpercentage) {
        this.comboboxpercentage = comboboxpercentage;
    }

    @Override
    public String toString() {
        return "Offer{" + "comboboxroute=" + comboboxroute + ", comboboxpercentage=" + comboboxpercentage + '}';
    }

    
}
