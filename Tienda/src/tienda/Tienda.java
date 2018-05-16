package tienda;

/**
 *
 * @author FRANCISCO
 */
public class Tienda {
 //De la tienda nos interesa saber al menos el nombre, dirección y RUC.   
    
private String nombreTienda;
private String direccionTienda;
private String RUC;

   /*Constructor vacio
    public Tienda() {
       nombreTienda = " ";
       direccionTienda =" ";
       RUC = " "; 
    }*/
//Constructor

    public Tienda(String nombreTienda, String direccionTienda, String RUC) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.RUC = RUC;
    }

//Geters y Seters
    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }


    
    
    
}
