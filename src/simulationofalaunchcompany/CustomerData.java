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
public class CustomerData implements Serializable {
    private String name;
    private int phone;
    private String combobox;
    private String address;
    private int nid;

    public CustomerData(String name, int phone, String combobox, String address, int nid) {
        this.name = name;
        this.phone = phone;
        this.combobox = combobox;
        this.address = address;
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCombobox() {
        return combobox;
    }

    public void setCombobox(String combobox) {
        this.combobox = combobox;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Override
    public String toString() {
        return "CustomerData{" + "name=" + name + ", phone=" + phone + ", combobox=" + combobox + ", address=" + address + ", nid=" + nid + '}';
    }
    
}
