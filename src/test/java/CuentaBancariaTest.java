import org.example.CuentaBancaria.CuentaBancaria;
import org.example.CuentaBancaria.InsufficientFundsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciando Test de CuentaBancaria");
    }

    @Test
    public void testDepositar(){
        CuentaBancaria miCuenta = new CuentaBancaria(122398374L,782394823874L,1000D);
        miCuenta.depositar(234.2D);
        Assertions.assertEquals(1234.2D,miCuenta.getCaja());
    }
    @Test
    public void testRetiro(){
        CuentaBancaria miCuenta = new CuentaBancaria(122398374L,782394823874L,1000D);
        Assertions.assertDoesNotThrow(()->{
            miCuenta.retirar(12.2D);
            Assertions.assertEquals((1000D-12.2D),miCuenta.getCaja());
        });
    }
    @Test
    public void testLimiteRetiro(){
        CuentaBancaria miCuenta = new CuentaBancaria(122398374L,782394823874L,1000D);
        Assertions.assertThrows(InsufficientFundsException.class, ()->{
            miCuenta.retirar(1001D);
        });
    }

}
