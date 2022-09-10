package br.com.alura.forum.controller;

import br.com.alura.forum.domain.dto.TopicoDto;
import br.com.alura.forum.domain.model.Curso;
import br.com.alura.forum.domain.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@ResponseBody
public class TopicosController {
    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping("/topicos")
    public List<TopicoDto> listarTopicos(String nomeCurso){
        List<Topico> topicos;
        if(nomeCurso == null){
            topicos = topicoRepository.findAll();
        }else {
            topicos = topicoRepository.findByCursoNome(nomeCurso);
        }
        return TopicoDto.converter(topicos);

    }
}
