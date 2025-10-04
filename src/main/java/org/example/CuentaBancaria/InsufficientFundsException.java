package org.example.CuentaBancaria;

public class InsufficientFundsException extends Throwable{
    public InsufficientFundsException(){
        super("El monto solicitado supera el balance disponible");
    }
}
