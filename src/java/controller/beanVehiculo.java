/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author 
 */
@Named(value = "beanVehiculo")
@SessionScoped
public class beanVehiculo implements Serializable {

    /**
     * Creates a new instance of beanVehiculo
     */   
    String c ;  
    int anio = Calendar.getInstance().get(Calendar.YEAR);
    String marca;
    String modelo = "No importa";
    String estilo;
    String combustible;
    String financiamiento;
    String aIncion;
    String aFinal;
    String precioIncial= ""+1;
    String precioFinal=""+999999999;
    String ordenar;
    String lista;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }

    public String getaIncion() {
        return aIncion;
    }

    public void setaIncion(String aIncion) {
        this.aIncion = aIncion;
    }

    public String getaFinal() {
        return aFinal;
    }

    public void setaFinal(String aFinal) {
        this.aFinal = aFinal;
    }

    public String getPrecioIncial() {
        return precioIncial;
    }

    public void setPrecioIncial(String precioIncial) {
        this.precioIncial = precioIncial;
    }

    public String getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(String precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getOrdenar() {
        return ordenar;
    }

    public void setOrdenar(String ordenar) {
        this.ordenar = ordenar;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
    
    public beanVehiculo() {
        //b= fecha.get(Calendar.YEAR);

    }
    
    public ArrayList<String> llenarAnios(){
        ArrayList<String> anios = new ArrayList<>();
        String a;
        for (int i = 1960; i <= anio; i++) {
            a = i+"";
            anios.add(a);
    }
   return anios;     
}
    public String getValidar(){
        String validacion;
        double pIncial=0;
        double pFinal=0;
        if ((this.marca != null) && (this.marca.compareToIgnoreCase("Noimporta") == 0 )) {
             return "<p>"+"No selecciono la marca"+"<p>";      
        }else{
            
            validacion = "<p>"+"Marca: "+this.marca+"<p>";
        }
        
        if ((this.modelo != null)&& (this.modelo.compareToIgnoreCase("No importa")==0)) {
            return "<p>"+"No dijito un modelo"+"<p>";
        }else{
             validacion += "<p>"+"Modelo: "+this.modelo+"<p>";
        }
        
        if ((this.estilo!=null)&&(this.estilo.compareToIgnoreCase("NoImporta")==0)) {
             return "<p>"+"No selecciono un estilo"+"<p>";
        }else{
            validacion += "<p>"+"Estilo: "+this.estilo+"<p>";
        }
        
        if ((this.combustible!=null)&&(this.combustible.compareToIgnoreCase("NoImporta")==0)) {
             return "<p>"+"No selecciono un tipo de combustible"+"<p>";
        }else{
           validacion += "<p>" +"Financimiento: "+this.financiamiento+"<p>";
        }
                 
      if((this.precioIncial!=null)){
        pIncial = Double.parseDouble(this.precioFinal);
       
          if (pIncial>0) {
              validacion += "<p>" +"Precio inicial: "+this.precioIncial+"<p>";
          }
      }else{
          return "<p>" +"El precio debe ser mayor que 0"+"<p>";
      }
      
      if((this.precioFinal!=null)){
       pFinal = Double.parseDouble(this.precioFinal);
       
          if (pFinal>0) {
              validacion += "<p>" +"Precio final: "+this.precioFinal+"<p>";
          }
      }else{
          if (pFinal > pIncial) {
              return "<p>" +"El precio debe ser mayor que 0"+"<p>";
          }
          
      }
      
      
        return validacion;
    }
}
