package com.example.consumerRestTemplate.DummyApi;

import com.example.consumerRestTemplate.DummyApi.Dto.DummyResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DummyController {


    @GetMapping("user_id")
    public DummyResponseDto searchUserFake(@PathVariable(name = "user_id") String id) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<DummyResponseDto> responseDto = restTemplate.getForEntity(String.format("https://dummyjson.com/user/%s", id),
                DummyResponseDto.class);
        return responseDto.getBody();
    }
}
