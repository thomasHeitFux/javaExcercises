package Clase5;

public class FiltroVendible implements Filtrable{
    @Override
    public boolean cumpleFiltro(Producto producto){
     return producto.getPrecio()>0;
    }
}
