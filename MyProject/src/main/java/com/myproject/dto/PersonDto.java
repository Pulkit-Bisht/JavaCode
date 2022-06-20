package com.myproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
private String firstName;
private String lastName;
private String personEmail;
private String personPass;
}
