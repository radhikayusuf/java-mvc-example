/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.example.controller;

import javax.swing.JOptionPane;
import mvc.example.model.BarberModel;
import mvc.example.view.BarberView;

/**
 *
 * @author radhikayusuf
 * Nama  : Radhika Yusuf Alifiansyah
 * Kelas : IF6K
 * NIM   : 10117909
 * 
 */
public class BarberController {
    
    private BarberView mView;
    private BarberModel mData;
    
    public BarberController(BarberView view) {
        mView = view;
    }

    public void setData(BarberModel data) {
        this.mData = data;
    }

    public void simpanValue() {
        if(mView.getFieldName().getText().trim().equals("")){
            JOptionPane.showMessageDialog(mView, "Nama tidak boleh kosong", "Warning", JOptionPane.INFORMATION_MESSAGE);            
        } else if(mView.getFieldEmail().getText().trim().equals("")) {
            JOptionPane.showMessageDialog(mView, "Email tidak boleh kosong", "Warning", JOptionPane.INFORMATION_MESSAGE);            
        } else if(mView.getFieldNoTelp().getText().trim().equals("")){                  
            JOptionPane.showMessageDialog(mView, "No Tlpn tidak boleh kosong", "Warning", JOptionPane.INFORMATION_MESSAGE);            
        } else {
            mData.setName(mView.getFieldName().getText());
            mData.setNoTelp(mView.getFieldNoTelp().getText());
            mData.setEmail(mView.getFieldEmail().getText());
            mData.saveValue();
        }                       
    }

    public void resetValue() {
        mData.resetValue();
    }
    
    
    
    
    
}
