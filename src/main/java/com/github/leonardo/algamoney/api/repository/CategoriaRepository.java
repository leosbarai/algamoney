package com.github.leonardo.algamoney.api.repository;

import com.github.leonardo.algamoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
