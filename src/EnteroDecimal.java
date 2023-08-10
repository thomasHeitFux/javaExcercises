import java.util.Scanner;

public class EnteroDecimal {
    public static void enteroDecimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa el numero: ");
        double num = scanner.nextDouble();

        System.out.println((int)num);
    }
}
