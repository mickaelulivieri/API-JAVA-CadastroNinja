package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninja")
public class NinjaController {

    //injetar dependencia service
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> ListarNinjas(){
        return ninjaService.listarNinjas();
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
