package dev.java10x.CadastroNinja.Missoes;

import dev.java10x.CadastroNinja.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_Missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;

    private String dificuldade;

    @OneToMany (mappedBy = "missoes")
    private NinjaModel ninja;
}
