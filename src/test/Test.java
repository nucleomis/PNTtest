package test;

import Models.Fruta_Vegetal;
import Models.Gaseosa;
import Models.Producto;
import Models.Shampoo;

public class Test {

    static final Gaseosa coca_cola1 = new Gaseosa(1.5,"Coca-Cola zero",20);
    static final Gaseosa coca_cola2 = new Gaseosa(1.5,"Coca-Cola",18);
        
    static final Shampoo sedal = new Shampoo("Shampoo Sedal", "500ml", 19);
   
    static final Fruta_Vegetal frutilla = new Fruta_Vegetal("Kilo", 10, "Frutillas", 64);
    
    static final Producto[] lista = {coca_cola1, coca_cola2, sedal, frutilla};
    
    public static void main(String[] args) {
        
        for (Producto lista1 : lista) {
            System.out.println(lista1);
        }
        
        System.out.println(new String(new char[29]).replace("\0", "="));
        
        getMayorMenorPrecio();
    }
    
    static void getMayorMenorPrecio(){  
        Producto mayor = lista[0];
        Producto menor = lista[0];
        for (Producto lista1 : lista) {
            int valor_mayor = mayor.compareTo(lista1);
            int valor_menor = menor.compareTo(lista1);
            
            if (valor_mayor < 0) {mayor = lista1;}
            if (valor_menor > 0){menor = lista1;}
        }
        System.out.println("Producto más caro: "+ mayor.getNombre());
        System.out.println("Producto más barato: "+ menor.getNombre()); 
    }
}
