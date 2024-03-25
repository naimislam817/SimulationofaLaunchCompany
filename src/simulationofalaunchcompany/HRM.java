/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulationofalaunchcompany  ;

import java.io.Serializable;
import java.time.LocalDate;
import javafx.scene.control.DatePicker;

/**
 *
 * @author naimi
 */
public class HRM implements Serializable {
    private String Notice;
    private int date;

    public HRM(String Notice, int date) {
        this.Notice = Notice;
        this.date = date;
    }

    public String getNotice() {
        return Notice;
    }

    public void setNotice(String Notice) {
        this.Notice = Notice;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HRM{" + "Notice=" + Notice + ", date=" + date + '}';
    }
   

    

  

    
    
    
}
