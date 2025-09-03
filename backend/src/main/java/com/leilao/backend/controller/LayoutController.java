package com.leilao.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LayoutController {

    @GetMapping("/")
    public String formularioCadastro() {
        return "cadastro-form";
    }
}