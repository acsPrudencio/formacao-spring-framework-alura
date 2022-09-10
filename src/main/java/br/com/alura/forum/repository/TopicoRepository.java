package br.com.alura.forum.repository;

import br.com.alura.forum.domain.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    //Curso é uma entidade e Nome é um campo da entidade curso
    List<Topico> findByCursoNome(String nomeCurso);
}
