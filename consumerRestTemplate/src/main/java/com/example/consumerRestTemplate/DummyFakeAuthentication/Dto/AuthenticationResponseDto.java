package com.example.consumerRestTemplate.DummyFakeAuthentication.Dto;

import lombok.Data;

@Data
public class AuthenticationResponseDto {


    public class UserAuthDTO {
        private Long id;
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private String gender;
        private String image;
        private String token;

    }
}
