package com.myproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Entity(name = "person")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "Id")
    private Integer personId;
    @Column(name = "first_name")
    private String personFirstName;
    @Column(name = "last_name")
    private String personLastName;
    @Column(name = "email")
    private String personEmail;
    @Column(name = "password")
    private String personPass;
//    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
//    @JoinColumn(name = "ad_fk",referencedColumnName = "Id")
//    @Column(name = "address")
//    private List<Address> person_address;

}
