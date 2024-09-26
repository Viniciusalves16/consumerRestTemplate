package com.example.consumerRestTemplate.rickandMortyApi;


import com.example.consumerRestTemplate.rickandMortyApi.dto.RickAndMortyResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RickAndMortyController {

    @GetMapping("{id_character}")
    public RickAndMortyResponseDto lookingForCharacter(@PathVariable(value = "id_character") String character) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RickAndMortyResponseDto> response = restTemplate
                .getForEntity(String.format("https://rickandmortyapi.com/api/character/%s", character)
                        , RickAndMortyResponseDto.class);

        return response.getBody();


    }

}
