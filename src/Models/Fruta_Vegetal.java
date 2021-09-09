
package Models;


public class Fruta_Vegetal extends Producto{
    String unidad_venta;
    double peso;
    
    
    public Fruta_Vegetal(String unidad_venta, double peso, String nombre, int precio) {
        super(nombre, precio);
        this.unidad_venta = unidad_venta;
        this.peso = peso;
    }

    public String getUnidad_venta() {
        return unidad_venta;
    }

    public void setUnidad_venta(String unidad_venta) {
        this.unidad_venta = unidad_venta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String getDescripcion() {
        return "Nombre: "+this.getNombre()+" /// Precio: $"+getPrecio()+" /// Unidad de Venta: "+getUnidad_venta();
    }
    
    @Override
    public String toString(){
        return getDescripcion();
    }

}
