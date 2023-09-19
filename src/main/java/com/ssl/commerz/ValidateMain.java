package com.ssl.commerz;

import java.util.HashMap;
import java.util.Map;

public class ValidateMain {
    public static void main(String[] args) throws Exception {
        TransactionResponseValidator transactionResponseValidator = new TransactionResponseValidator();
        Map<String, String> request = Map.of(
                "tran_id", "TESTASPNET1234"
        );
        transactionResponseValidator.receiveSuccessResponse(request);
    }
}
