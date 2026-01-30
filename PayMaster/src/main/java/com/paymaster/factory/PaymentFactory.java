package com.paymaster.factory;

import com.paymaster.service.MetodoPago;
import com.paymaster.service.PagoEfectivo;
import com.paymaster.service.PagoTarjeta;

public class PaymentFactory {
    public static MetodoPago createPayment(String type) {
        switch (type.toUpperCase()) {
            case "EFECTIVO":
                return new PagoEfectivo();
            case "TARJETA":
                return new PagoTarjeta();
            default:
                throw new IllegalArgumentException("Tipo inválido: " + type);
        }
    }
}
