package com.leilao.backend.config.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerarSenha {
    public static void main(String[] args) {
        BCryptPasswordEncoder enconde = new BCryptPasswordEncoder();
    }
}
