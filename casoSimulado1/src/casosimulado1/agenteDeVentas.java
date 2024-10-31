/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casosimulado1;

/**
 *
 * @author Aulas Heredia
 */
public class agenteDeVentas {
    //Atributos
    private String agenteCedula = "";
    private String agenteCodigo = "";
    private String Sucursal = "";
    private String posesionVehiculo = "No";
    //Metodo constructor
    public agenteDeVentas(String agenteCedula, String agenteCodigo, String Sucursal, String posesionVehiculo) {
        
    }
    //Metodos
    //Getters
    public String getAgenteCedula() {
        return agenteCedula;
    }
    public String getAgenteCodigo() {
        return agenteCodigo;
    }
    public String getSucursal() {
        return Sucursal;
    }
    public String getPosesionVehiculo() {
        return posesionVehiculo;
    }
    //Setters
    public void setAgenteCedula(String agenteCedula) {
        this.agenteCedula = agenteCedula;
    }
    public void setPosesionVehiculo(String posesionVehiculo) {
        this.posesionVehiculo = posesionVehiculo;
    }
    public void setAgenteCodigo(String agenteCodigo) {
        this.agenteCodigo = agenteCodigo;
    }
    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }
}
