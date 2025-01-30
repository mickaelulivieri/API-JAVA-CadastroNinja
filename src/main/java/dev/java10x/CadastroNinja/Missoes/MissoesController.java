package dev.java10x.CadastroNinja.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MissoesController {
    @GetMapping("/olamundo")
    public String tudoDeBom(){

        return "Essa é minha primeira mensagem";
    }
}