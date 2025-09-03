package com.leilao.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leilao.backend.model.enums.StatusLeilao;
import com.leilao.backend.model.Categoria;
import com.leilao.backend.model.Leilao;
import com.leilao.backend.model.Pessoa;

@Repository
public interface LeilaoRepository extends JpaRepository<Leilao, Long> {
    List<Leilao> findByVendedor(Pessoa vendedor);

    List<Leilao> findByCategoria(Categoria categoria);

    List<Leilao> findByStatus(StatusLeilao status);

    List<Leilao> findByTituloContainingIgnoreCase(String titulo);
}
