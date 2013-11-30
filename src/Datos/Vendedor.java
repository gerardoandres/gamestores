/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Gerardo
 */
public class Vendedor {
    
    private int numeroVend;
    private String passwordVend;
    private String nombreVend;

    public Vendedor(int numeroVend, String passwordVend, String nombreVend) {
        this.numeroVend = numeroVend;
        this.passwordVend = passwordVend;
        this.nombreVend = nombreVend;
    }
    public Vendedor() {
        this.numeroVend = 0;
        this.passwordVend = "";
        this.nombreVend = "";
    }

    /**
     * @return the numeroVend
     */
    public int getNumeroVend() {
        return numeroVend;
    }

    /**
     * @param numeroVend the numeroVend to set
     */
    public void setNumeroVend(int numeroVend) {
        this.numeroVend = numeroVend;
    }

    /**
     * @return the passwordVend
     */
    public String getPasswordVend() {
        return passwordVend;
    }

    /**
     * @param passwordVend the passwordVend to set
     */
    public void setPasswordVend(String passwordVend) {
        this.passwordVend = passwordVend;
    }
    
    public String getnombreVend() {
        return nombreVend;
    }

    /**
     * @param nombreVend the passwordVend to set
     */
    public void setnombreVend(String nombreVend) {
        this.nombreVend = nombreVend;
    }
    
    
}
