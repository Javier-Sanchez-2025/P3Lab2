package com.paymaster.main;

import com.paymaster.repository.CloudPaymentRepository;
import com.paymaster.service.PaymentService;

public class Main {
    public static void main(String[] args) {
        CloudPaymentRepository repository = new CloudPaymentRepository();
        PaymentService service = new PaymentService(repository);

        service.checkout(150.75, "Efectivo");
        service.checkout(299.99, "Tarjeta");
    }
}