package br.com.alura.forum.controller;

import br.com.alura.forum.domain.dto.TopicoDto;
import br.com.alura.forum.domain.model.Curso;
import br.com.alura.forum.domain.model.Topico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@ResponseBody
public class TopicosController {


    @GetMapping("/topicos")
    public List<TopicoDto> listarTopicos(){
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Spring", "Programação"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico, topico, topico));
    }
}
