package com.example.consumerRestTemplate.DummyApi.Dto;

import lombok.Data;

@Data
public class BankDTO {

    private String cardExpire;
    private String cardNumber;
    private String cardType;
    private String currency;
    private String iban;
}
