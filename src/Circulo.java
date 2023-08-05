import java.util.Scanner;

public class Circulo {
    private static final double PI= 3.14159265359;

    public static void calcular(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa radio: ");
        double radio = scanner.nextDouble();

        boolean salir = false;
        while (!salir) {
            System.out.println("Elige una opcion:");
            System.out.println("1. Calcular el area.");
            System.out.println("2. Calcular circunferencia.");
            System.out.println("0. Salir.");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                    double area = calcularArea(radio);
                    System.out.println("El area es: "+area);}
                case 2 -> {
                    double circunferencia = calcularCircunferencia(radio);
                    System.out.println("la circunferencia es: "+ circunferencia);
                }
                case 0 -> {
                    System.out.println("Saliendo del programa...");
                    salir = true;

                }
                default -> System.out.println("Opción inválida.");
            }
        }
        scanner.close();
    }
    public static double calcularArea(double radio){
        return PI*radio;
    }
    public static double calcularCircunferencia(double radio){
        return 2.0*radio*PI;
    }
}
