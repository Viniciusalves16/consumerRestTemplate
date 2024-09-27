package com.example.consumerRestTemplate.DummyFakeAuthentication;

import com.example.consumerRestTemplate.DummyFakeAuthentication.Dto.AuthenticationResponseDto;
import com.example.consumerRestTemplate.DummyFakeAuthentication.Dto.LoginRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AuthenticationController {


    @PostMapping("/login")
    public AuthenticationResponseDto autheticationFake(@RequestBody LoginRequestDto loginRequest) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<AuthenticationResponseDto> response = restTemplate.postForEntity("https://dummyjson.com/auth/login", loginRequest, AuthenticationResponseDto.class);

        return response.getBody();

    }


}
