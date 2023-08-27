import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

//import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(); // Crea una instancia de Calculadora antes de cada prueba
    }
    @Test
    @DisplayName("Prueba de suma")
    public void testAdd(){
        //GIVEN
        int a = 50;
        int b = 10;
        //WHEN
        int result = Calculadora.add(a, b);
        //THEN
        int expected=60;
        Assertions.assertEquals(result,expected);

}


    @Test
    @DisplayName("prueba de resta")
    void subtract() {
        //GIVEN
        int a = 50;
        int b = 10;
        //WHEN
        int result = calculadora.subtract(a, b);
        //THEN
        int expected=40;
        Assertions.assertEquals(result,expected);
    }

    @Test
    @DisplayName("prueba de multiplicar")
    void multiply() {
        //GIVEN
        int a = 50;
        int b = 10;
        //WHEN
        int result = calculadora.multiply(a, b);
        //THEN
        int expected=500;
        Assertions.assertEquals(result,expected);
    }

    @Test
    @DisplayName("prueba de division")
    void divide() {
        //GIVEN
        int a = 50;
        int b = 10;
        //WHEN
        int result = calculadora.divide(a, b);
        //THEN
        int expected=5;
        Assertions.assertEquals(result,expected);
    }
}