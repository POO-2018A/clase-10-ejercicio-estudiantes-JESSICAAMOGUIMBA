/*
Escribir un programa que permita administrar los productos de una tienda. 
El programa debe permitir ingresar los datos básicos de la tienda, productos 
que ofrece. Se debe generar una factura para cada venta.

* De la tienda nos interesa saber al menos el nombre, dirección y RUC.
* De los productos nos interesa registrar: marca, código (único), 
tipo ("alimento", "electrodoméstico", "ropa"), precio.
Crear una clase principal que nos permita:

1.-Ingresar los datos de la tienda.
2.-Ingresar la información de los productos que ofrece la tienda
3.-Mostrar un menú de opciones
    -Ingresar nuevo producto
    -Visualizar lista de productos
    -Salir
*/
package tienda;

import java.util.Scanner;

/**
 *
 * @author FRANCISCO
 */
public class Principal {
    public static void main(String[] args) {
    
        //DATOS PARA LA TIENDA
        Scanner scan = new Scanner (System.in);
        String nombreTienda ;
        String direccionTienda;
        String RUC;
        System.out.println("De una direccion para la tienda"); 
        direccionTienda = scan.next();
        scan.nextLine();
        System.out.println("Ingrese el RUC para la tienda"); 
        RUC = scan.nextLine();
        
        
        //PROC¿DUCTOS DE LA TIENDA
        
        System.out.println("Productos que ofrece la tienda: ");  
        System.out.println("Electrodomesticos");
        System.out.println("Alimentacion");
        System.out.println("Ropa");
        
        //DATOS PARA EL PRODUCTO
        
       String marcaProducto;
       String codigoProducto;
       String tipoProducto;
       Double precio;
       
        int opcion =0;
       do {
        System.out.println("De un nombre a la tienda"); 
        System.out.println("\t BIENVENIDOS A LA TIENDA:  "+  scan.nextLine());
        System.out.println("MENU\n");
        System.out.println("1.- Ingresar nuevo producto");
        System.out.println("2.- Visualizar lista de productos");
        System.out.println("3.- Salir");
        System.out.println("Seleccione una opción");
      
        opcion =scan.nextInt();
         
        switch(opcion){
            
            case 1:
              System.out.println(" Ingrese datos del producto");
               scan.nextLine();
              System.out.println("Ingrese la marca del producto"); 
              marcaProducto = scan.next();
              scan.nextLine();
       
              System.out.println("Ingrese el codigo para el producto"); 
              codigoProducto = scan.nextLine();
       
              System.out.println("Ingrese el tipo de producto: alimento,electrodoméstico,ropa "); 
              tipoProducto = scan.next();
       
              scan.nextLine();
              System.out.println("Ingrese el precio para el producto ejm.: 20,52  ó 10"); 
              precio = scan.nextDouble();
              
              System.out.println("gracias por cras un nuevo producto\n: ");
              
                break;
            case 2:
                System.out.println(" Visualizar lista de productos");
                
                System.out.println("Electrodomesticos");
                System.out.println("Alimentacion");
                System.out.println("Ropa");
                   
                break;
            case 3:
                System.out.println(" Salir");
                break;
                
                
            default:
                System.out.println(" Opcion no valida, intente nuevamente");
                break;
         
        }
       
       System.out.println("Gracias por su visita, Buen día...!!");
       scan.nextLine();
       }while (opcion !=3);
        
        
    }
    
}
