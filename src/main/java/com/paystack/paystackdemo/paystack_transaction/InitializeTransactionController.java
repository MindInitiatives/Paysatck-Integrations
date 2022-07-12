package com.paystack.paystackdemo.paystack_transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class InitializeTransactionController {

    @Autowired
    private InitializeTransactionService initializeTransactionService;

    @RequestMapping(path = "/initializetransaction", method = RequestMethod.POST)
    public InitializeTransactionResponseDTO initializeTransaction(@RequestBody InitializeTransactionRequestDTO initializeTransactionRequestDTO) {

        InitializeTransactionResponseDTO initializeTransaction = initializeTransactionService.initializeTransaction(initializeTransactionRequestDTO);

        return initializeTransaction;
    }
}
