/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuno;

/**
 *
 * @author Aulas Heredia
 */
public class Facturas {
     //Atributos
    private String nombreCliente = "";
    private String cedulaCliente = "";
    private String codigoFactura = "";
    private double montoDeLaFactura = 0.00;
    private int numeroDeMes = 1;
    private String nombreDeMes = "";
    private int productosElectricos = 0;
    private int productosAutomotrices = 0;
    private int productosConstruccion = 0;
    //Metodo cosntructor
    public Facturas(String nombreCliente, String cedulaCliente, String codigoFactura, double montoDeLaFactura, int numerDeMes, int productosElectricos, int productosAutomotrices, int productosConstruccion) {
        
    }
    //Métodos
    
    //Getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public double getMontoDeLaFactura() {
        return montoDeLaFactura;
    }

   

    public int getProductosElectricos() {
        return productosElectricos;
    }

    public int getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public int getProductosConstruccion() {
        return productosConstruccion;
    }

    public String getNombreDeMes() {
        return nombreDeMes;
    }
    
    //Setters

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setMontoDeLaFactura(double montoDeLaFactura) {
        this.montoDeLaFactura = montoDeLaFactura;
    }

   

    public void setProductosElectricos(int productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public void setProductosAutomotrices(int productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public void setProductosConstruccion(int productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }
}
