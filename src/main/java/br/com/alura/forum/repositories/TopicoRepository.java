package br.com.alura.forum.repositories;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
//    nessa interface JpaRepository já tem um monte de métodos comuns
//    ex.: carregar todos, salvar, excluir, alterar
//    por isso ela fica vazia
}
