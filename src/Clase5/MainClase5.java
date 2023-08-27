package Clase5;

import java.util.ArrayList;
import java.util.List;

public class MainClase5 {
    public static void main(){
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("clases.Producto 1", 50.0, "pepino"));
        listaProductos.add(new Producto("clases.Producto 2", 25.0, "harina"));
        listaProductos.add(new Producto("clases.Producto 3", 0.0, "queseyo"));
        listaProductos.add(new Producto("filtros.Descartable 1", 5.0, "tabaco"));
        listaProductos.add(new Producto("filtros.Descartable 2", 10.0, "azucar"));

        System.out.println("\nProductos que cumplen con el filtro 'filtros.Vendible':");
        Filtrable vendibleFiltro = new FiltroVendible();
        filtrarProductos(listaProductos, vendibleFiltro).forEach(System.out::println);
    }
    private static List<Producto> filtrarProductos(List<Producto> productos, Filtrable filtro) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (filtro.cumpleFiltro(producto)) {

                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }
}
