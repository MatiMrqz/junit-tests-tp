import org.example.ConversorTemperatura.ConversorTemperatura;
import org.example.ConversorTemperatura.NullTemperatureNotAllowed;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {
    @BeforeAll
    public static void initTest(){
        System.out.println("Tests ConversorTemperatura");
    }
    @Test
    public void toFahrenheitTest(){
        Assertions.assertEquals(32F, ConversorTemperatura.toFahrenheit(0F));
    }
    @Test
    public void toCelsiusTest(){
        Assertions.assertEquals(0F, ConversorTemperatura.toCelsius(32F));
    }

    @Test
    public void nullValueHandlingTest(){
        Assertions.assertThrows(NullTemperatureNotAllowed.class,()->{ConversorTemperatura.toFahrenheit(null);});
    }
}
