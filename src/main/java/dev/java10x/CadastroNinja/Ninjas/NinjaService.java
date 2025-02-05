package dev.java10x.CadastroNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    //atributo para injecao de dependencia
    private NinjaRepository ninjaRepository;

    //construtor para injecao de dependencia
    public NinjaService(NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
    }

    //metodos com logica de negocio

    // Listar todos os meus ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    //listar ninjas por ID
    public NinjaModel listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //deletar um ninja
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    //atualizar ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
