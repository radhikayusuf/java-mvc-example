/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.example.model;

import javax.swing.JOptionPane;
import mvc.example.event.BarberUserEventListener;

/**
 *
 * @author radhikayusuf
 * Nama  : Radhika Yusuf Alifiansyah
 * Kelas : IF6K
 * NIM   : 10117909
 * 
 */
public class BarberModel {
    private String name;
    private String email;
    private String noTelp;
    private BarberUserEventListener userEventListener;

    public BarberModel() {
    }  
    
    public BarberModel(String name, String email, String noTelp) {
        this.name = name;
        this.email = email;
        this.noTelp = noTelp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyDataChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyDataChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        notifyDataChange();
    }

    public void setUserEventListener(BarberUserEventListener userEventListener) {
        this.userEventListener = userEventListener;
    }
               
    protected void notifyDataChange(){
        if(userEventListener != null) userEventListener.onDataChange(this);
    }

    public void saveValue() {
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan", "Information", JOptionPane.INFORMATION_MESSAGE);        
        resetValue();
    }
    
    public void resetValue() {       
        setName("");
        setEmail("");
        setNoTelp("");
    }
        
    
}
