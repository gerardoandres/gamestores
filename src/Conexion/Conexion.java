/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo
 */
public class Conexion {
      //Atributos del API JDBC

    private Connection dbConexion;
    private Statement dbStatement;
    private ResultSet dbResultSet;
    //Atributos para la Conexion
    private String nombreBaseDatos;
    private String nombreTabla;
    private String user;
    private String password;
    private String sentenciaSQL;
    private boolean esSelect;
    private String driver;
    private String url;

    public Conexion(String nombreBaseDatos, String nombreTabla, String user, String password, String sentenciaSQL, boolean esSelect, String driver, String url) {
        this.nombreBaseDatos = nombreBaseDatos;
        this.nombreTabla = nombreTabla;
        this.user = user;
        this.password = password;
        this.sentenciaSQL = sentenciaSQL;
        this.esSelect = esSelect;
        this.driver = driver;
        this.url = url;
    }

    public Conexion() {
        this.nombreBaseDatos = "";
        this.nombreTabla = "";
        this.user = "";
        this.password = "";
        this.sentenciaSQL = "";
        this.esSelect = false;
        this.driver = "";
        this.url = "";
    }

    /**
     * @return the dbConexion
     */
    public Connection getDbConexion() {
        return dbConexion;
    }

    /**
     * @param dbConexion the dbConexion to set
     */
    public void setDbConexion(Connection dbConexion) {
        this.dbConexion = dbConexion;
    }

    /**
     * @return the dbStatement
     */
    public Statement getDbStatement() {
        return dbStatement;
    }

    /**
     * @param dbStatement the dbStatement to set
     */
    public void setDbStatement(Statement dbStatement) {
        this.dbStatement = dbStatement;
    }

    /**
     * @return the dbResultSet
     */
    public ResultSet getDbResultSet() {
        return dbResultSet;
    }

    /**
     * @param dbResultSet the dbResultSet to set
     */
    public void setDbResultSet(ResultSet dbResultSet) {
        this.dbResultSet = dbResultSet;
    }

    /**
     * @return the nombreBaseDatos
     */
    public String getNombreBaseDatos() {
        return nombreBaseDatos;
    }

    /**
     * @param nombreBaseDatos the nombreBaseDatos to set
     */
    public void setNombreBaseDatos(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
    }

    /**
     * @return the nombreTabla
     */
    public String getNombreTabla() {
        return nombreTabla;
    }

    /**
     * @param nombreTabla the nombreTabla to set
     */
    public void setNombreTabla(String nombreTabla) {
        this.nombreTabla = nombreTabla;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the sentenciaSQL
     */
    public String getSentenciaSQL() {
        return sentenciaSQL;
    }

    /**
     * @param sentenciaSQL the sentenciaSQL to set
     */
    public void setSentenciaSQL(String sentenciaSQL) {
        this.sentenciaSQL = sentenciaSQL;
    }

    /**
     * @return the esSelect
     */
    public boolean isEsSelect() {
        return esSelect;
    }

    /**
     * @param esSelect the esSelect to set
     */
    public void setEsSelect(boolean esSelect) {
        this.esSelect = esSelect;
    }

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Metodo para cerrar la conexion
     */
    public void cerrarConexion() {
        try {
            this.getDbConexion().close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo principal para realizar la conexion y ejecutar las sentencias SQL
     */
    public void conectar() {
        try {
            //Cargar el Driver de Conexion
            Class.forName(this.getDriver());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        try {
            //Crear una nueva conexion
            this.setDbConexion(DriverManager.getConnection(
                    this.getUrl(),
                    this.getUser(),
                    this.getPassword()));
            //Crear el objeto para ejecutar sentencias SQL
            this.setDbStatement(this.getDbConexion().createStatement());



        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        //Verificar si se ejecuta una QUERY o un UPDATE
        if (this.isEsSelect() == true)
        {
            try {
                //Ejecutar una QUERY
                this.setDbResultSet(this.getDbStatement().executeQuery(this.getSentenciaSQL()));
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
        else {
            try {
                //Ejecutar un UPDATE
                this.getDbStatement().executeUpdate(this.getSentenciaSQL());
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
