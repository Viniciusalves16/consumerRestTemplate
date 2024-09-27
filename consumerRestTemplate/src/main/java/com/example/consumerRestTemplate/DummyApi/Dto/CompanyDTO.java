package com.example.consumerRestTemplate.DummyApi.Dto;

import lombok.Data;

@Data
public class CompanyDTO {

    private AddressDTO address;
    private String department;
    private String name;
    private String title;
}
