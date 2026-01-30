package com.paymaster.service;

public class PagoEfectivo implements MetodoPago {
    @Override
    public void realizarPago(double monto) {
        System.out.println("Paga: " + monto + " en efectivo.");
    }
}
