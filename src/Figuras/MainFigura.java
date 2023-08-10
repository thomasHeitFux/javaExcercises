package Figuras;

public class MainFigura {
    public static void figs(){
        Figura[] figuras = new Figura[4];
        figuras[0] = new Cuadrado();
        figuras[1] = new Circulo();
        figuras[2] = new Cuadrado();
        figuras[3] = new Cuadrado();
    int cuadrados=0;
    int circulos=0;
        for (Figura figura:figuras) {
            if (figura instanceof Circulo){
                circulos++;
            } else if (figura instanceof Cuadrado) {
                cuadrados++;
            }
        }
        System.out.println("Cantidad de cuadrados: " + cuadrados);
        System.out.println("Cantidad de círculos: " + circulos);
    }

}
