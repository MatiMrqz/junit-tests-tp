package org.example.CuentaBancaria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

@Setter
@Getter
@AllArgsConstructor
public class CuentaBancaria {
    private Long nroCuentaBancaria;
    private char divisa = '$';
    private Long CBU;
    private BigDecimal caja;

    public CuentaBancaria(Long nroCuentaBancaria, Long CBU, Double montoinicial) {
        this.nroCuentaBancaria = nroCuentaBancaria;
        this.CBU = CBU;
        this.caja = new BigDecimal(montoinicial);
    }

    public void depositar(Double monto){
        this.caja = this.caja.add(new BigDecimal(monto));
    }

    public void retirar(Double monto) throws InsufficientFundsException{
        if (monto > this.caja.doubleValue()) throw new InsufficientFundsException();
        this.caja = this.caja.subtract(new BigDecimal(monto));
    }

    public Double getCaja(){
        return this.caja.doubleValue();
    }
}
