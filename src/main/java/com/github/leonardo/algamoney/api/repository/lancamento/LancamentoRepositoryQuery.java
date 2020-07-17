package com.github.leonardo.algamoney.api.repository.lancamento;

import com.github.leonardo.algamoney.api.model.Lancamento;
import com.github.leonardo.algamoney.api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
