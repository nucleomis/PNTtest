
package Models;


public class Gaseosa extends Producto {
    
    double litros;
    
    public Gaseosa(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String getDescripcion() {
        return "Nombre: "+this.getNombre()+" /// Litros: "+ getLitros()+" /// Precio: $"+getPrecio();
    }
    
    @Override
    public String toString(){
        return getDescripcion();
    }
}
