package com.oodles.Criteria_Builder.model.request;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.oodles.Criteria_Builder.entities.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonRequestModel {

    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

    @JsonProperty(value = "mobile")
    private Long mobile;

    @JsonProperty(value = "address")
    private Set<Address> address = new HashSet<>();
}
