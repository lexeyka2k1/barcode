package ru.rounb.springsBarcode.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String login;
    private String password;
}
