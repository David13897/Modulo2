import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {
    private Calculadora calculadora;
    private int n1, n2;
    private double resultado;

    @BeforeEach
    public void inicializa(){
        calculadora = new Calculadora();
        n1=1;
        n2=2;
    }

    @AfterEach
    public void finaliza(){
        n1=n2=0;
        resultado=0;
    }
    //a)
    @Test
    void multiplicacao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.multiplicar(1,2));
    }
    //b)
    @Test
    void subtracao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(1, calculadora.subtrair(2,1));
    }
    //c)
    @Test
    void divisao(){
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(2,1));
    }
}
