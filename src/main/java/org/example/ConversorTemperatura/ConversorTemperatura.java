package org.example.ConversorTemperatura;

import java.util.Objects;
import java.util.Optional;

public class ConversorTemperatura {
    public static Float toCelsius(Float fahrenheit){
        if (Objects.isNull(fahrenheit)) throw new NullTemperatureNotAllowed("Debe especificar valor");
        return ((fahrenheit-32)*(5/9));
    }

    public static Float toFahrenheit(Float celsius){
        if (Objects.isNull(celsius)) throw new NullTemperatureNotAllowed("Debe especificar valor");
        return (celsius*9/5)+32;
    }
}
