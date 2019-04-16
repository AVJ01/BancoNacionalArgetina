/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancon;

/**
 *
 * @author AVJ
 */
public class Clientes {
    private int idC;
    private int NoCuenta;
    private String nombre;
    private String apellidos;
    private float dinero;
    private float multa;
    private float Dretirado;//dinero retirado
    private String contraseña;
    private int clave;

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dineto) {
        this.dinero = dineto;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public float getDretirado() {
        return Dretirado;
    }

    public void setDretirado(float Dretirado) {
        this.Dretirado = Dretirado;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    void setNoCuenta(String NuCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
