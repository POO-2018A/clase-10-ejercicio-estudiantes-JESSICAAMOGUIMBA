package tienda;

/**
 *
 * @author FRANCISCO
 */
/*De los productos nos interesa registrar: marca, código (único), 
tipo ("alimento", "electrodoméstico", "ropa"), precio.*/
public class Producto {
    private String marcaProducto;
    private String codigoProducto;
    private String tipoProducto;
    private Double precio;

    //Constructor

    public Producto(String marcaProducto, String codigoProducto, String tipoProducto, Double precio) {
        this.marcaProducto = marcaProducto;
        this.codigoProducto = codigoProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }
    
    
    
    
    //Geters y Seters
    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
}
