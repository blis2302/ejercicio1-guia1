
package ejercicio1.guia1;


public class Ejercicio1Guia1 {

   
    public static void main(String[] args) {
      Producto p1 = new Producto(123, "Producto de ejemplo", 10.99, 50);
        
        // Mostrar estado de los atributos del objeto producto
        System.out.println("Código: " + p1.getCodigo());
        System.out.println("Descripción: " + p1.getDescripcion());
        System.out.println("Precio: " + p1.getPrecio());
        System.out.println("Stock: " + p1.getStock());
    }
    
}
