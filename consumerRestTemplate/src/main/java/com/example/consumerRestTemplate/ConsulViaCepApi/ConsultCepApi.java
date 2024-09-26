package com.example.consumerRestTemplate.ConsulViaCepApi;

import com.example.consumerRestTemplate.ConsulViaCepApi.dto.AddressDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consult-cep")
public class ConsultCepApi {


    @GetMapping("{cep}")
    public AddressDto consultCep(@PathVariable("cep") String cep) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AddressDto> response =
                restTemplate.getForEntity(
                        String.format("http://viacep.com.br/ws/%s/json/", cep),
                        AddressDto.class);

        return response.getBody();
    }
}
