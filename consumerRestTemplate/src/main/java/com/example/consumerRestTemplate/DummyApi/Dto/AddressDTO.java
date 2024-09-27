package com.example.consumerRestTemplate.DummyApi.Dto;

import lombok.Data;

@Data
public class AddressDTO {

    private String address;
    private String city;
    private CoordinatesDTO coordinates;
    private String postalCode;
    private String state;
}
