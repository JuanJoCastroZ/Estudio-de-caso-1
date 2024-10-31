/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casosimulado1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class MainClass {
    public static void main(String[] args){
        //Se almacena en variables para poder solicitar los datos que serán utilizados en el constructor del objeto Agente
        String cedulaAgente = JOptionPane.showInputDialog("Ingrese la cedula del agente: ");
        String codigoAgente = JOptionPane.showInputDialog("Ingrese el codigo del agente: ");
        String sucursalAgente = JOptionPane.showInputDialog("Ingrese la sucursal del agente: ");
        String posesionVehiculoAgente = JOptionPane.showInputDialog("¿El agente posee vehículo?: ");
        //Se instancia el objeto agente a traves del metodo constructor
        agenteDeVentas agente1 = new agenteDeVentas(cedulaAgente, codigoAgente, sucursalAgente, posesionVehiculoAgente);
        //Se solicita el numero de facturas por ser instanciadas
        int numFacturas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de facturas por ser registradas: "));
        //Se instancian facturas solicitando información para las mismas dependiendo del numero introducido anteriormente
        for(int i = 0 ; i <= numFacturas; i++)
        {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cedula del cliente: ");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el codigo del cliente: ");
            double montoDeLaFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
            int numerDeMes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de mes de la factura: "));
            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de productos electricos vendidos: "));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de productos automotrices vendidos: "));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de productos de construccion vendidos: "));
            //Se rellena constructor con la data solicitada anteriormente
            Facturas factura = new Facturas(nombreCliente, cedulaCliente, codigoFactura, montoDeLaFactura, numerDeMes, productosElectricos, productosAutomotrices, productosConstruccion);
            
        }
        
        
        
    }
}
