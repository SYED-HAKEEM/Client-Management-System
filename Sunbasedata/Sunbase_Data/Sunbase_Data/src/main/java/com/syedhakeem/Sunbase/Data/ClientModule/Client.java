package com.syedhakeem.Sunbase.Data.ClientModule;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "FirstName")
    private String firtsName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "State")
    private String state;
    @Column(name = "email")
    private String email;
    @Column(name = "Phone")
    private String phone;
}
