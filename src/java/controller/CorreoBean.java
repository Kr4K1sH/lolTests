/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author 
 */
@Named(value = "correoBean")
@SessionScoped
public class CorreoBean implements Serializable {

String para;
    String CC;
    String mensaje;
    
    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   
    /**
     * Creates a new instance of CorreoBean
     */
    public CorreoBean() {
    }
    public String getValidar(){
       String correo="";
        if (this.para!=null) {
            if (this.para.contains("@")) {   
                correo = "Enviado";
            }else{
            return "El correo debe contener @";
            }
        }
           if (this.para.contains(".com")) {
                    correo = "Enviado";
                
                }else{
                return "Verifique que su correo contenga .com";
                }
        return correo;
    }
    public void cancelar(){
        this.setPara("");
        this.setMensaje("");
        this.setCC("");

    }
            
}


