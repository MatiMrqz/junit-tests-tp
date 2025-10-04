package org.example;

import org.example.ConversorTemperatura.ConversorTemperatura;
import org.example.CuentaBancaria.CuentaBancaria;
import org.example.CuentaBancaria.InsufficientFundsException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Ejercicio 1 - Cuenta Bancaria
        CuentaBancaria miCuenta = new CuentaBancaria(122398374L,782394823874L,1000D);
        try{
        miCuenta.depositar(234.2D);
        System.out.println("Monto en caja:"+miCuenta.getCaja());
        miCuenta.retirar(500.45D);
        System.out.println("Monto en caja:"+miCuenta.getCaja());
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        //Ejercicio 2 - Conversor Temperatura
        System.out.println(ConversorTemperatura.toFahrenheit(13F));
        System.out.println(ConversorTemperatura.toCelsius(90F));
    }
}