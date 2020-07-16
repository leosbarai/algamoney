package com.github.leonardo.algamoney.api.service;

import com.github.leonardo.algamoney.api.model.Lancamento;
import com.github.leonardo.algamoney.api.model.Pessoa;
import com.github.leonardo.algamoney.api.repository.LancamentoRepository;
import com.github.leonardo.algamoney.api.repository.PessoaRepository;
import com.github.leonardo.algamoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());

        if (!pessoa.isPresent() || pessoa.get().isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }

        return lancamentoRepository.save(lancamento);

    }
}
