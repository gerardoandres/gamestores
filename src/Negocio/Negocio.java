/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import Datos.ProductoComprado;
import Conexion.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gerardo
 */
public class Negocio {
    private Conexion cnn;
    
    public Negocio() {
        cnn = new Conexion();
    }
    private void configurarConexion() {
        cnn.setNombreBaseDatos("GameStore");
        cnn.setNombreTabla("ProductoComprado");
        cnn.setUser("root");
        cnn.setPassword("");
        cnn.setDriver("com.mysql.jdbc.Driver");
        cnn.setUrl("jdbc:mysql://localhost:3306/"
                + cnn.getNombreBaseDatos());
    }
    public void insertarProducto(ProductoComprado agregar) {
        this.configurarConexion();
        this.cnn.setEsSelect(false);
        this.cnn.setSentenciaSQL("insert into "
                + this.cnn.getNombreTabla()
                + " values ("
                + agregar.getCodigoCompra()+",'"
                + agregar.getNombreProducto()+ "','"
                + agregar.getMarcaProducto()+ "','"
                + agregar.getModeloProducto()+ "',"
                + agregar.getPrecioProducto()+ ",'"
                + agregar.getFechaProducto()+ "','"
                + agregar.getDetalleProducto()+ "')");
        this.cnn.conectar();
        this.cnn.cerrarConexion();
    }
    public ProductoComprado buscarProducto(int numeroserie) {
        ProductoComprado buscar = new ProductoComprado();
        this.configurarConexion();
        this.cnn.setEsSelect(true);
        this.cnn.setSentenciaSQL("select * from "
                + this.cnn.getNombreTabla() + " where CodigoSerie=" + numeroserie);
        this.cnn.conectar();
        try {
            if (this.cnn.getDbResultSet().next()) {
                buscar.setCodigoCompra(this.cnn.getDbResultSet().getInt(1));
                buscar.setNombreProducto(this.cnn.getDbResultSet().getString("Nombre"));
                buscar.setMarcaProducto(this.cnn.getDbResultSet().getString("Marca"));
                buscar.setModeloProducto(this.cnn.getDbResultSet().getString("Modelo"));
                buscar.setPrecioProducto(this.cnn.getDbResultSet().getInt("Precio"));
                buscar.setFechaProducto(this.cnn.getDbResultSet().getString("Fecha"));
                buscar.setDetalleProducto(this.cnn.getDbResultSet().getString("Detalle"));    
            }
        } catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.cnn.cerrarConexion();
        return buscar;
    }
    public void eliminarProducto(int numeroserie) 
    {
        this.configurarConexion();
        this.cnn.setEsSelect(false);
        this.cnn.setSentenciaSQL("Delete from " + 
                this.cnn.getNombreTabla() +
                " where CodigoSerie=" + numeroserie);
        this.cnn.conectar();
        this.cnn.cerrarConexion();
    }
    public void modificarProducto(ProductoComprado modificar)
    {
        this.configurarConexion();
        this.cnn.setEsSelect(false);
        this.cnn.setSentenciaSQL("update " + this.cnn.getNombreTabla() + 
                                 " set  Nombre='" + modificar.getNombreProducto()+ "'," + 
                                 "Marca='" + modificar.getMarcaProducto()+ "'," + 
                                 "Modelo='" + modificar.getModeloProducto()+ "'," + 
                                 "Precio=" + modificar.getPrecioProducto()+ "," + 
                                 "Fecha='" + modificar.getFechaProducto()+ "'," +        
                                 "Detalle='" + modificar.getDetalleProducto()+ "'" +    
                                 " where CodigoSerie=" + modificar.getCodigoCompra());
        this.cnn.conectar();
        this.cnn.cerrarConexion();
    }
}
