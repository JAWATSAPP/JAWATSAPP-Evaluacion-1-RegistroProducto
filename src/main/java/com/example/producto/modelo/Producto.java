/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.producto.modelo;

/**
 *
 * @author sise
 */
public class Producto {
    
       private String nomProdct;
       private String fecCadu;
       private String stockMin;
       private String stockMax;
       private String precioUnit;
       private String categ;
       private String marca;

    public String getNomProdct() {
        return nomProdct;
    }

    public void setNomProdct(String nomProdct) {
        this.nomProdct = nomProdct;
    }

    public String getFecCadu() {
        return fecCadu;
    }

    public void setFecCadu(String fecCadu) {
        this.fecCadu = fecCadu;
    }

    public String getStockMin() {
        return stockMin;
    }

    public void setStockMin(String stockMin) {
        this.stockMin = stockMin;
    }

    public String getStockMax() {
        return stockMax;
    }

    public void setStockMax(String stockMax) {
        this.stockMax = stockMax;
    }

    public String getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(String precioUnit) {
        this.precioUnit = precioUnit;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
