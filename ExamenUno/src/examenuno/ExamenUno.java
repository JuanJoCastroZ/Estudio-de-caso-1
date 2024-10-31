/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenuno;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class ExamenUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se almacena en variables para poder solicitar los datos que serán utilizados en el constructor del objeto Agente
        String nombreAgente = JOptionPane.showInputDialog("Ingrese el nombre del agente: ");
        String cedulaAgente = JOptionPane.showInputDialog("Ingrese la cedula del agente: ");
        String codigoAgente = JOptionPane.showInputDialog("Ingrese el codigo del agente: ");
        String sucursalAgente = JOptionPane.showInputDialog("Ingrese la sucursal del agente: ");
        String posesionVehiculoAgente = JOptionPane.showInputDialog("¿El agente posee vehículo?: ");
        //Varaible con mes
        String mesNombre = "";
        //Se instancia el objeto agente y calculadora a traves del metodo constructor
        agenteDeVentas agente1 = new agenteDeVentas(nombreAgente, cedulaAgente, codigoAgente, sucursalAgente, posesionVehiculoAgente);
        calculadoraBonosYPuntos calculadoraGlobal = new calculadoraBonosYPuntos(0, 0.00);
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
           // mesNombre = factura.getNombreDeMes;
            calculadoraGlobal.setCantidadFacturas(1); //Suma 1 factura por cada recorrido del for
            //Suma 1 tipo de producto si han sido vendidos en la factura
            if(productosElectricos > 0)
            {
                calculadoraGlobal.setTipoDeProductos(1);
            }
            if(productosAutomotrices > 0)
            {
                calculadoraGlobal.setTipoDeProductos(1);
            }
            if(productosConstruccion > 0)
            {
                calculadoraGlobal.setTipoDeProductos(1);
            }
            calculadoraGlobal.setTotalFactura(montoDeLaFactura); //Pasa el monto total de la actual factura
            calculadoraGlobal.setTotalVendidoFacturas(montoDeLaFactura); //Suma el monto total de la actual factura a la ganancia total
        }
        JOptionPane.showMessageDialog(null, "El agente vendedor " + agente1.getNombre() + " codigo " + agente1.getAgenteCodigo() + " en el mes de Noviembre");
        calculadoraGlobal.bono10();
        calculadoraGlobal.bonoElectricos();
        calculadoraGlobal.bonoAutomotrices();
        calculadoraGlobal.bonoConstruccion();
        JOptionPane.showMessageDialog(null, "vendio un total de " + calculadoraGlobal.getTotalVendidoFacturas());
        //JOptionPane.showMessageDialog(null, "vendio un total de " + calculadoraGlobal.get no me dio tiempo :c
    }
}
