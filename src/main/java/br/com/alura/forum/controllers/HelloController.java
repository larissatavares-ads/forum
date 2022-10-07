package br.com.alura.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    //se nao colocar @ResponseBody o spring vai considerar que o retorno é uma pagina do projeto
    public String hello(){
        return "Hello, World!";
    }
}
