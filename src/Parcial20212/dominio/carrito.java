package Parcial20212.dominio;

import java.util.List;

public class carrito {
    public static final byte CANTIDAD_MAXIMA = 20;
    private String supermercado;
    private List<Producto> productos;

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

    public List<Producto> buscarTipo(String tipo){
        List<Producto> buscar = new ArrayList<>();

        for (Producto producto: this.productos){
            if(producto.getCantidadActual() == 0);
        }
    }

    public boolean agregar(Producto p){
        if (this.productos.size()< CANTIDAD_MAXIMA){
           this.productos.add(p);
           return true;
        }
        return false;
    }

    public boolean sacardelcarrito(String nombre){
        Producto productoBuscado = buscar(nombre);

        if (productoBuscado != null){
            this.productos.remove(productoBuscado);
            return true;
        }

        return false;
    }

    public int calcularValorTotal(){
        int valorTotal = 0;

        for (Producto p: this.productos) {
            valorTotal += p.getPrecio();
        }
        return valorTotal;
    }

    public Producto productoMasCaro(){
        int otroprecio;

        if(productoMasCaro.getprecio>otroprecio){
        System.out.println("El producto más caro");

        return productoMasCaro()
    }
}