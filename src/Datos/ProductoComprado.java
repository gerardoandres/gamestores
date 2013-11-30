/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Gerardo
 */
public class ProductoComprado {
    
    private int numeroserie;
    private int codigoCompra;
    private int codigoVenta;
    private String nombreProducto;
    private String marcaProducto;
    private String modeloProducto;
    private int stockProducto;
    private int precioProducto;
    private String fechaProducto;
    private String detalleProducto;
    private String tipoVenta;

    public ProductoComprado(int numeroserie, int codigoCompra, int codigoVenta, 
            String nombreProducto, String marcaProducto, String modeloProducto, 
            int stockProducto, int precioProducto, String fechaProducto, String detalleProducto) {
        this.numeroserie = numeroserie;
        this.codigoCompra = codigoCompra;
        this.codigoVenta = codigoVenta;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.modeloProducto = modeloProducto;
        this.stockProducto = stockProducto;
        this.precioProducto = precioProducto;
        this.fechaProducto = fechaProducto;
        this.detalleProducto = detalleProducto;
    }
    public ProductoComprado() {
        this.numeroserie = 0;
        this.codigoCompra = 0;
        this.codigoVenta = 0;
        this.nombreProducto = "";
        this.marcaProducto = "";
        this.modeloProducto = "";
        this.stockProducto = 0;
        this.precioProducto = 0;
        this.fechaProducto = "";
        this.detalleProducto = "";
    }

    /**
     * @return the numeroserie
     */
    public int getNumeroserie() {
        return numeroserie;
    }

    /**
     * @param numeroserie the numeroserie to set
     */
    public void setNumeroserie(int numeroserie) {
        this.numeroserie = numeroserie;
    }

    /**
     * @return the codigoCompra
     */
    public int getCodigoCompra() {
        return codigoCompra;
    }

    /**
     * @param codigoCompra the codigoCompra to set
     */
    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    /**
     * @return the codigoVenta
     */
    public int getCodigoVenta() {
        return codigoVenta;
    }

    /**
     * @param codigoVenta the codigoVenta to set
     */
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the marcaProducto
     */
    public String getMarcaProducto() {
        return marcaProducto;
    }

    /**
     * @param marcaProducto the marcaProducto to set
     */
    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    /**
     * @return the modeloProducto
     */
    public String getModeloProducto() {
        return modeloProducto;
    }

    /**
     * @param modeloProducto the modeloProducto to set
     */
    public void setModeloProducto(String modeloProducto) {
        this.modeloProducto = modeloProducto;
    }

    /**
     * @return the stockProducto
     */
    public int getStockProducto() {
        return stockProducto;
    }

    /**
     * @param stockProducto the stockProducto to set
     */
    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    /**
     * @return the precioProducto
     */
    public int getPrecioProducto() {
        return precioProducto;
    }

    /**
     * @param precioProducto the precioProducto to set
     */
    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    /**
     * @return the fechaProducto
     */
    public String getFechaProducto() {
        return fechaProducto;
    }

    /**
     * @param fechaProducto the fechaProducto to set
     */
    public void setFechaProducto(String fechaProducto) {
        this.fechaProducto = fechaProducto;
    }

    /**
     * @return the detalleProducto
     */
    public String getDetalleProducto() {
        return detalleProducto;
    }

    /**
     * @param detalleProducto the detalleProducto to set
     */
    public void setDetalleProducto(String detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    /**
     * @return the tipoVenta
     */
    public String getTipoVenta() {
        return tipoVenta;
    }

    /**
     * @param tipoVenta the tipoVenta to set
     */
    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }
    
    
    
    
}