package com.paymaster.repository;

import com.paymaster.singleton.TransactionLogger;

public class CloudPaymentRepository implements IPaymentRepository {
    @Override
    public void saveTransaction(String details) {
        TransactionLogger.getInstance().log("Guardando en la nube: " + details);
    }
}
