package com.github.leonardo.algamoney.api.repository;

import com.github.leonardo.algamoney.api.model.Lancamento;
import com.github.leonardo.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
