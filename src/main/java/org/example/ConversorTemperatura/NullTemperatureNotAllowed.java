package org.example.ConversorTemperatura;

public class NullTemperatureNotAllowed extends RuntimeException {
    public NullTemperatureNotAllowed(String message) {
        super(message);
    }
}
