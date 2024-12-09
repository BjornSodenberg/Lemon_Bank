package com.dlb.lemon_bank.domain.dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer lemons;
    private Integer diamonds;
    private String userRole;
    private String jobTitle;

}
