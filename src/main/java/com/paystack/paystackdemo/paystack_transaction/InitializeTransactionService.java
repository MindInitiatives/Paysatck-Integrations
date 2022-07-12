package com.paystack.paystackdemo.paystack_transaction;

public interface InitializeTransactionService {
    InitializeTransactionResponseDTO initializeTransaction (
            InitializeTransactionRequestDTO initializeTransactionRequestDTO
    );
}
