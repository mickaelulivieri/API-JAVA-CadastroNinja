package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
public class NinjaController {

    @GetMapping ("/boasVindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem";
    }

    //adicionar ninja
    @PostMapping("/adicionar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //procurar por id
    @GetMapping("/porid")
    public String mostrarNinjaPorId(){
        return "Ninja mostrado por id";
    }

    //mostrar todos os ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Ninja mostrado";
    }
    //alterar dados dos ninjas
    @PutMapping("/update")
    public String alterarNinja(){
        return "Ninja alterado";
    }

    //deletar ninja
    @DeleteMapping
    public String deletarNinja(){
        return "Ninja deletado";
    }
}
