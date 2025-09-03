package com.leilao.backend.dto;

import java.util.Date;
import java.util.List;

import com.leilao.backend.model.PessoaPerfil;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PessoaResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String codigoValidacao;
    private Date validadeCodigoValidacao;
    private Boolean ativo;
    private List<PessoaPerfil> pessoaPerfil;
}
