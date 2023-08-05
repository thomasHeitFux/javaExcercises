
import java.util.Scanner;

public class Alumnos {

    public static void alumnosPromedio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa usuarios: ");
        int alumnos = Integer.parseInt(scanner.nextLine());
        double[] notas = new double[alumnos];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingresa nota para el alumno " + i);
            int nota = Integer.parseInt(scanner.nextLine());
            notas[i] = nota;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("Elige una opcion:");
            System.out.println("1. Calcular el promedio de las calificaciones.");
            System.out.println("2. Encontrar la calificación más alta.");
            System.out.println("3. Encontrar la calificación más baja.");
            System.out.println("0. Salir.");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 ->{
                double promedio = calcularPromedio(notas);
                System.out.println(promedio);}
                case 2 -> {
                    double mayor = mayor(notas);
                    System.out.println("la mayor nota es: "+ mayor);
                }
                case 3 -> {
                    double menor = menor(notas);
                    System.out.println("la menor es: "+menor);
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

//PROMEDIO
    public static double calcularPromedio(double[] array) {

        double suma = 0;
        for (double numero : array) {
            suma += numero;
        }

        return suma / array.length;
    }
    public static double mayor(double[] array){
       double maxima = 0;
        for (double nota:array) {
            if (nota>maxima){
                maxima = nota;
            }
        }
        return maxima;
    }
    public static double menor(double[] array){
        double minima = 99999.9999;
        for (double nota:array) {
            if (nota<minima){
                minima = nota;
            }
        }
        return minima;
    }
}





//
//        5
//        Dependiendo de la opción seleccionada por el usuario,
//        realizar la operación correspondiente utilizando
//        estructuras de control condicional "if/else" o el operador ternario.
//
//        6
//
//        6
//        Si el usuario selecciona "Salir del programa", finalizará la ejecución del programa.
//
//        Recuerda utilizar adecuadamente las estructuras de control, bucles
//        y arrays para lograr los resultados esperados.¡Buena suerte
//        y espero ver tus soluciones pronto!