package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NinjaController {

    @GetMapping ("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem";
    }
}
