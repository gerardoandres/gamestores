/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Gerardo
 */
public class Administrador {
    
    private int numeroAdm;
    private String PasswordAdm;
    

    public Administrador(int numeroAdm, String PasswordAdm) {
        this.numeroAdm = numeroAdm;
        this.PasswordAdm = PasswordAdm;
    }
    public Administrador() {
        this.numeroAdm = 0;
        this.PasswordAdm = "";
    }

    /**
     * @return the numeroAdm
     */
    public int getNumeroAdm() {
        return numeroAdm;
    }

    /**
     * @param numeroAdm the numeroAdm to set
     */
    public void setNumeroAdm(int numeroAdm) {
        this.numeroAdm = numeroAdm;
    }

    /**
     * @return the PasswordAdm
     */
    public String getPasswordAdm() {
        return PasswordAdm;
    }

    /**
     * @param PasswordAdm the PasswordAdm to set
     */
    public void setPasswordAdm(String PasswordAdm) {
        this.PasswordAdm = PasswordAdm;
    }
    
    
}
