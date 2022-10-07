package br.com.alura.forum.controllers;

import br.com.alura.forum.controllers.dtos.TopicoDto;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repositories.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDto> lista(String nomeCurso){
        System.out.println(nomeCurso);
        List<Topico> topicos = topicoRepository.findAll();
        return TopicoDto.converter(topicos);
    }

//    @RequestMapping("/topicos")
//    public List<TopicoDto> lista(){
//        List<Topico> topicos = topicoRepository.findAll();
//        return TopicoDto.converter(topicos);
//    }
}
