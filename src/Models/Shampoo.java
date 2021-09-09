
package Models;


public class Shampoo extends Producto {
    String contenido;

    public Shampoo(String nombre, String contenido, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String getDescripcion() {
        return "Nombre: "+this.getNombre()+" /// Contenido: "+ getContenido()+" /// Precio: $"+getPrecio();
    }
    
    @Override
    public String toString(){
        return getDescripcion();
    }
}
