package ru.rounb.springsBarcode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
public class Institution {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, nullable = false)
    private String key;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String password;
}
