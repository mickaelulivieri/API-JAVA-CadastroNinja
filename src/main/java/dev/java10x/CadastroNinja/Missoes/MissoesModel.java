package dev.java10x.CadastroNinja.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "tb_Missoes")
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome_Missao")
    private String nomeMissao;

    @Column(name = "Dificuldade_missao")
    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    @Column(name = "Ninja_atribuido")
    @JsonIgnore
    private List<NinjaModel> ninjas;
}
