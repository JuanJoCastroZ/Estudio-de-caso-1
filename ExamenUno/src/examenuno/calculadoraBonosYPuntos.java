/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenuno;

/**
 *
 * @author Aulas Heredia
 */
public class calculadoraBonosYPuntos {
    //Atributos
    private int tipoDeProductos = 0;
    private int pMotrices = 0;
    private int pConstruccion = 0;
    private int pElectricos = 0;
    private int bono = 0;
    private int puntos = 0;
    private double totalFactura = 0; //El total ganado en la factura
    private double totalVendidoFacturas = 0; //total ganado entre todas las facturas
    private int cantidadFacturas = 0;
    private double totalComisiones = 0;
    private boolean puedeTenerBono = true;
    
    //Metodo constructor
    public calculadoraBonosYPuntos(int tiposDeProductos, double totalFactura) {
        this.tipoDeProductos = tiposDeProductos;
        this.totalFactura = totalFactura;
    }
    //Metodos
    public void bono10(){
        if(tipoDeProductos == 3){
            totalComisiones = totalComisiones + (totalFactura * 0.10);
            puedeTenerBono = false;
            puntos = puntos + 3;
        }
    }
    public void bonoElectricos()
    {
        if(puedeTenerBono == true && pElectricos >= 3)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.04);
        }
        else if(puedeTenerBono == true)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.02);
        }
        puntos = puntos + 1;
    }
    public void bonoAutomotrices()
    {
        if(puedeTenerBono == true && pMotrices >= 4)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.04);
        }
        else if(puedeTenerBono == true)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.02);
        }
        puntos = puntos + 1;
    }
    public void bonoConstruccion()
    {
        if(puedeTenerBono == true && pConstruccion >= 1)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.08); 
            puntos = puntos + 2;
        }
    }
    public void bono50000(){
        if(totalFactura > 50000)
        {
            totalComisiones = totalComisiones + (totalFactura * 0.05); 
            puntos = puntos + 1;
        }
    }
    
    public void bonoExtra()
    {
        if(cantidadFacturas > 3 || totalVendidoFacturas > 300000)
        {
            totalComisiones = totalComisiones + 20000;
        }
    }
    //Getters

    public int getTipoDeProductos() {
        return tipoDeProductos;
    }

    public int getpMotrices() {
        return pMotrices;
    }

    public int getpConstruccion() {
        return pConstruccion;
    }

    public int getpElectricos() {
        return pElectricos;
    }

    public int getBono() {
        return bono;
    }

    public int getPuntos() {
        return puntos;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public double getTotalVendidoFacturas() {
        return totalVendidoFacturas;
    }

    public int getCantidadFacturas() {
        return cantidadFacturas;
    }
    
    //Setters

    public void setTipoDeProductos(int tipoDeProductos) {
        this.tipoDeProductos = tipoDeProductos;
    }

    public void setpMotrices(int pMotrices) {
        this.pMotrices = pMotrices;
    }

    public void setpConstruccion(int pConstruccion) {
        this.pConstruccion = pConstruccion;
    }

    public void setpElectricos(int pElectricos) {
        this.pElectricos = pElectricos;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public void setTotalVendidoFacturas(double totalVendidoFacturas) {
        this.totalVendidoFacturas = this.totalVendidoFacturas + totalVendidoFacturas;
    }

    public void setCantidadFacturas(int cantidadFacturas) {
        this.cantidadFacturas = this.cantidadFacturas + cantidadFacturas;
    }
    
}
