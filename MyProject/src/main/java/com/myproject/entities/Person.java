package com.myproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer person_id;
    @Column(name = "first_name")
    private String person_fname;
    @Column(name = "last_name")
    private String person_lname;
    @Column(name = "email")
    private String person_email;
    @Column(name = "password")
    private String person_pass;
    @OneToMany
    @JoinColumn(name = "Id")
    @Column(name = "address")
    private List<Address> person_address;

}
