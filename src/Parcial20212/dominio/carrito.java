package Parcial20212.dominio;

import java.util.List;
import java.util.stream.Collectors;

public class carrito {
    public static final byte CANTIDAD_MAXIMA = 20;
    private String supermercado;
    private List<Producto> productos;

    public carrito (String supermercado){
        this.supermercado
    }
}

    public Producto buscar(String nombre){
        Producto productoBuscado = null;

        for (Producto producto: this.productos){
            if (producto.getNombre() == nombre){
                productoBuscado = producto;
                break;
            }
        }
        return productoBuscado;
    }
    //  prpductoBuscado = this.productos.stream().filter(p->p.getNombre().equalsIgnoreCase(nombre).findFirst()or else()

    public List<Producto> buscarTipo(String tipo){
        List<Producto> productoBuscado = this.productos.stream().filter(prod->prod.getTipo().equals(tipo)).collect(Collectors.toList());
        return productoBuscado;

        //
    }

    public boolean agregar(Producto p){
        if (this.productos.size()< CANTIDAD_MAXIMA){
           this.productos.add(p);
           return true;
        }
        else{
            return false;
        }
    }

    public boolean sacardelcarrito(Producto producto){
        Producto productoBuscado = buscar(producto.getNombre());
        //Producto productoASacar = buscar(nombre)

        if (productoBuscado != null){
            this.productos.remove(producto);
            //this.productos.remove(productoASacar);
            return true;
        }
        return false;
    }

    public int calcularValorTotal(){
        int valorTotal = 0;

        for (Producto prod:this.productos) {
            valorTotal += prod.getPrecio();
        }
        //for (Producto p: this.productos) {
            //valorTotal += p.getPrecio();
        //}
        //valorTotal= this.productos.stream().mapToInt(p->getPrecio()).sum
        return valorTotal;
    }

    public getProductoMasCaro(){
        Producto productoMasCaro = null;

        for (Producto p: this.productos){
            if(p.getPrecio()>productoMasCaro.getPrecio)
        }

    }
