package com.paymaster.service;

public class PagoTarjeta implements MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("Paga: " + monto + " con tarjeta.");
    }
}
