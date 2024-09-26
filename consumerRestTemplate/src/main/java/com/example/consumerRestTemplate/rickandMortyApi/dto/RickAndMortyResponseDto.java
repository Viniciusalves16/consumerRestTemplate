package com.example.consumerRestTemplate.rickandMortyApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class RickAndMortyResponseDto {

    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    @JsonProperty("origin")
    private Location origin;

    @JsonProperty("location")
    private Location location;

    private String image;
    private List<String> episode; // List of episode URLs
    private String url;
    private String created;


}